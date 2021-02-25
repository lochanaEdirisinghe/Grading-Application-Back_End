package lk.lochana.gradingapplication.controller;

import lk.lochana.gradingapplication.dto.AssingmentDto;
import lk.lochana.gradingapplication.dto.GradeDto;
import lk.lochana.gradingapplication.dto.QuestionDto;
import lk.lochana.gradingapplication.dto.StandardResponse;
import lk.lochana.gradingapplication.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/assignments")
public class AssingmentController {

    @Autowired
    private AssignmentService service;

    @GetMapping("/{teacherId}")
    public ResponseEntity<StandardResponse> getAssingments(@PathVariable String teacherId){
        List<AssingmentDto> assingments = service.getAssingments(teacherId);

        return new ResponseEntity(new StandardResponse(200, "true", assingments), HttpStatus.OK);
    }

    @GetMapping("questions/{asmntId}")
    public ResponseEntity<StandardResponse> getQuestions(@PathVariable String asmntId){
        List<QuestionDto> questions = service.getQuestions(asmntId);
        return new ResponseEntity(new StandardResponse(200, "true", questions), HttpStatus.OK);
    }

    @GetMapping("/grades/{asmntId}")
    public ResponseEntity<StandardResponse> getOverallGrades(@PathVariable("asmntId") String asmnId){
        List<GradeDto> overallGrades = service.getOverallGrades(asmnId);
        return new ResponseEntity(new StandardResponse(200, "true", overallGrades), HttpStatus.OK);
    }


}
