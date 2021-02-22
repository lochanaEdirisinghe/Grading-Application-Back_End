package lk.lochana.gradingapplication.service;

import lk.lochana.gradingapplication.dto.MarksDto;
import lk.lochana.gradingapplication.dto.OverallMarksDto;

import java.util.List;

public interface TeacherService {
    OverallMarksDto getOverallMarks(String asmentId, int qNo);
}
