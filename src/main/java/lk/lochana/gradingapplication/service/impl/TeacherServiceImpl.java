package lk.lochana.gradingapplication.service.impl;

import lk.lochana.gradingapplication.dto.MarksDto;
import lk.lochana.gradingapplication.dto.OverallMarksDto;
import lk.lochana.gradingapplication.dto.QuestionDto;
import lk.lochana.gradingapplication.entity.StudentMarks;
import lk.lochana.gradingapplication.repository.StudentMarksRepository;
import lk.lochana.gradingapplication.service.TeacherService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

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
}
