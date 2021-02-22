package lk.lochana.gradingapplication.controller;

import lk.lochana.gradingapplication.dto.MarksDto;
import lk.lochana.gradingapplication.dto.OverallMarksDto;
import lk.lochana.gradingapplication.dto.StandardResponse;
import lk.lochana.gradingapplication.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    @Autowired
    private TeacherService service;


    @GetMapping("/{asmentId}/{qNo}")
    public ResponseEntity getOverallMarks(@PathVariable("asmentId") String asmentId, @PathVariable("qNo") int qNo) {
        OverallMarksDto overallMarks = service.getOverallMarks(asmentId, qNo);

        return new ResponseEntity(new StandardResponse(200, "true", overallMarks), HttpStatus.OK);
    }
}
