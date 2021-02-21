package lk.lochana.gradingapplication.controller;

import lk.lochana.gradingapplication.dto.StandardResponse;
import lk.lochana.gradingapplication.dto.StudentDto;
import lk.lochana.gradingapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/{username}")
    @PreAuthorize("hasAuthority('STUDENT')")
    public ResponseEntity searchStudent(@PathVariable String username) {
        StudentDto studentDto = service.searchStudent(username);
        return new ResponseEntity(new StandardResponse(200, "true", studentDto), HttpStatus.OK);
    }




}
