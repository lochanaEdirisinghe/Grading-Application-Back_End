package lk.lochana.gradingapplication.service.impl;

import lk.lochana.gradingapplication.dto.MarksDto;
import lk.lochana.gradingapplication.dto.QuestionDto;
import lk.lochana.gradingapplication.entity.StudentMarks;
import lk.lochana.gradingapplication.repository.StudentMarksRepository;
import lk.lochana.gradingapplication.service.TeacherService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private StudentMarksRepository marksRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<MarksDto> getOverallMarks(String asmentId, int qNo) {
        List<StudentMarks> allmarksOfQuestion = marksRepository.findAllByAsmnt(asmentId, qNo);
        return modelMapper.map(allmarksOfQuestion, new TypeToken<List<MarksDto>>() {
        }.getType());
    }
}
