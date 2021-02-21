package lk.lochana.gradingapplication.service.impl;

import lk.lochana.gradingapplication.dto.StudentDto;
import lk.lochana.gradingapplication.entity.Student;
import lk.lochana.gradingapplication.repository.StudentRepository;
import lk.lochana.gradingapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public StudentDto searchStudent(String username) {
        if (!repository.existsById(username)) {
            throw new RuntimeException("No Such Student");
        }
        Optional<Student> student1 = repository.findStudentByUser(username);
        Student student = student1.get();
        return new StudentDto(student.getId(), student.getName(), student.getClassId().getName(),
                student.getClassId().getTeacher().getName());
    }
}
