package lk.lochana.gradingapplication.service.impl;

import lk.lochana.gradingapplication.dto.MarksDto;
import lk.lochana.gradingapplication.dto.OverallMarksDto;
import lk.lochana.gradingapplication.dto.TeacherDto;
import lk.lochana.gradingapplication.entity.StudentMarks;
import lk.lochana.gradingapplication.entity.Teacher;
import lk.lochana.gradingapplication.repository.StudentMarksRepository;
import lk.lochana.gradingapplication.repository.TeacherRepository;
import lk.lochana.gradingapplication.service.TeacherService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;


@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentMarksRepository marksRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public OverallMarksDto getOverallMarks(String asmentId, int qNo) {
        int hrs=0, min=0, rightCount=0,wrongCount=0, partialCount=0;

        List<StudentMarks> allmarksOfQuestion = marksRepository.findAllByAsmnt(asmentId, qNo);
        for (StudentMarks m: allmarksOfQuestion) {
            LocalTime t = m.getTimeSpent().toLocalTime();
            hrs+=t.getHour();
            min+=t.getMinute();

            switch (m.getResult()){
                case "right" :
                    rightCount++;
                    break;
                case "wrong" :
                    wrongCount++;
                    break;
                case  "partial":
                    partialCount++;
                    break;
            }

        }
        int students=allmarksOfQuestion.size();
        LocalTime avgTime=LocalTime.of(hrs/students, min/students);

        return new OverallMarksDto(avgTime, rightCount, wrongCount,partialCount,
                modelMapper.map(allmarksOfQuestion, new TypeToken<List<MarksDto>>() {
        }.getType()));

    }

    @Override
    public TeacherDto searchTeacher(String username) {

        if (teacherRepository.existByusername(username)==0) {
            throw new RuntimeException("No Such Teacher");
        }else{
            Optional<Teacher> teacher1 = teacherRepository.findByusername(username);
            Teacher teacher=teacher1.get();
            return new TeacherDto(teacher.getId(), teacher.getName(), teacher.getClassId().getName());
        }
    }
}
