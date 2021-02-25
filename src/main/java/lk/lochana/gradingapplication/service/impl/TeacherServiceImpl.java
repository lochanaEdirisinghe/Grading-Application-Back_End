package lk.lochana.gradingapplication.service.impl;

import lk.lochana.gradingapplication.dto.*;
import lk.lochana.gradingapplication.entity.GradeDetails;
import lk.lochana.gradingapplication.entity.StudentMarks;
import lk.lochana.gradingapplication.entity.Teacher;
import lk.lochana.gradingapplication.repository.GradeDetailRepository;
import lk.lochana.gradingapplication.repository.StudentMarksRepository;
import lk.lochana.gradingapplication.repository.TeacherRepository;
import lk.lochana.gradingapplication.service.TeacherService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentMarksRepository marksRepository;

    @Autowired
    private ModelMapper modelMapper;


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


    @Override
    public OverallMarksDto getOverallMarks(String asmentId, int qNo) {
        int hrs=0, min=0,sec=0, rightCount=0,wrongCount=0, partialCount=0;

        List<StudentMarks> overallMarksOfQuestion = marksRepository.findAllByAsmnt(asmentId, qNo);

        if(!overallMarksOfQuestion.isEmpty()){
            for (StudentMarks m: overallMarksOfQuestion) {
                LocalTime t = m.getTimeSpent().toLocalTime();
                hrs+=t.getHour();
                min+=t.getMinute();
                sec+=t.getSecond();

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
            int students=overallMarksOfQuestion.size();
            LocalTime avgTime=LocalTime.of(hrs/students, min/students, sec/students);

            return new OverallMarksDto(avgTime, rightCount, wrongCount,partialCount,
                    modelMapper.map(overallMarksOfQuestion, new TypeToken<List<MarksDto>>() {
                    }.getType()));

        }else {
            throw new RuntimeException("No such assignment");
        }
    }

}
