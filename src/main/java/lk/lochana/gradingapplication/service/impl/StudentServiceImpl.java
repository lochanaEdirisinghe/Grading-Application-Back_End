package lk.lochana.gradingapplication.service.impl;

import lk.lochana.gradingapplication.dto.MarksDto;
import lk.lochana.gradingapplication.dto.StudentDto;
import lk.lochana.gradingapplication.entity.Student;
import lk.lochana.gradingapplication.entity.StudentMarks;
import lk.lochana.gradingapplication.entity.StudentMarksPK;
import lk.lochana.gradingapplication.repository.StudentMarksRepository;
import lk.lochana.gradingapplication.repository.StudentRepository;
import lk.lochana.gradingapplication.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private StudentMarksRepository marksRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public StudentDto searchStudent(String username) {

        if (repository.existByusername(username)==0) {
            throw new RuntimeException("No Such Student");
        }
        Optional<Student> student1 = repository.findByusername(username);
        Student student = student1.get();
        return new StudentDto(student.getId(), student.getName(), student.getClassId().getName(),
                student.getClassId().getTeacher().getName());
    }

    @Override
    public MarksDto getMarks(String studentId, String asmntId, int qNo) {

        Optional<StudentMarks> studentMarks = marksRepository.findById(new StudentMarksPK(studentId, asmntId, qNo));
        return modelMapper.map(studentMarks.get(), MarksDto.class);
    }
}
