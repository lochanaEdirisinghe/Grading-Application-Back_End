package lk.lochana.gradingapplication.service;

import lk.lochana.gradingapplication.dto.AssingmentDto;
import lk.lochana.gradingapplication.dto.GradeDto;
import lk.lochana.gradingapplication.dto.QuestionDto;

import java.util.List;

public interface AssignmentService {
    List<AssingmentDto> getAssingments(String tracherId);
    List<QuestionDto> getQuestions(String asmntId);
    List<GradeDto> getOverallGrades(String asmnId);
}
