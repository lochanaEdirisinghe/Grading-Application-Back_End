package lk.lochana.gradingapplication.service;

import lk.lochana.gradingapplication.dto.MarksDto;
import lk.lochana.gradingapplication.dto.StudentDto;

public interface StudentService {

    StudentDto searchStudent(String id);

    MarksDto getMarks(String studentId, String asmntId, int qNo);
}
