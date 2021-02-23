package lk.lochana.gradingapplication.controller;

import lk.lochana.gradingapplication.dto.MarksDto;
import lk.lochana.gradingapplication.dto.OverallMarksDto;
import lk.lochana.gradingapplication.dto.StandardResponse;
import lk.lochana.gradingapplication.dto.TeacherDto;
import lk.lochana.gradingapplication.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    @Autowired
    private TeacherService service;


    @GetMapping("/{username}")
    public ResponseEntity searchTeacher(@PathVariable("username") String username){
        TeacherDto teacherDto = service.searchTeacher(username);
        return new ResponseEntity(new StandardResponse(200, "true", teacherDto), HttpStatus.OK);
    }


    @GetMapping("/{asmentId}/{qNo}")
    public ResponseEntity getOverallMarks(@PathVariable("asmentId") String asmentId, @PathVariable("qNo") int qNo) {
        OverallMarksDto overallMarks = service.getOverallMarks(asmentId, qNo);

        return new ResponseEntity(new StandardResponse(200, "true", overallMarks), HttpStatus.OK);
    }
}
