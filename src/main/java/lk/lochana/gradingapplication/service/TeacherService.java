package lk.lochana.gradingapplication.service;

import lk.lochana.gradingapplication.dto.MarksDto;

import java.util.List;

public interface TeacherService {
    List<MarksDto> getOverallMarks(String asmentId, int qNo);
}
