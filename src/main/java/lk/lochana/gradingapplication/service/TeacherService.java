package lk.lochana.gradingapplication.service;


import lk.lochana.gradingapplication.dto.OverallMarksDto;
import lk.lochana.gradingapplication.dto.TeacherDto;


public interface TeacherService {
    OverallMarksDto getOverallMarks(String asmentId, int qNo);

    TeacherDto searchTeacher(String teacherId);
}
