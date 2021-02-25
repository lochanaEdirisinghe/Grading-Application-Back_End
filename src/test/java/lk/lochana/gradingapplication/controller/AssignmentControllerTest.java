package lk.lochana.gradingapplication.controller;

import lk.lochana.gradingapplication.dto.AssingmentDto;
import lk.lochana.gradingapplication.dto.GradeDto;
import lk.lochana.gradingapplication.dto.QuestionDto;
import lk.lochana.gradingapplication.dto.StandardResponse;
import lk.lochana.gradingapplication.service.AssingmentService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AssignmentControllerTest {

    @Autowired
    private AssingmentController assingmentController;

    @MockBean
    private AssingmentService service;

    @Test
    public void getAssignmentsTest(){
        ResponseEntity actual = assingmentController.getAssingments("teacherId");
        List<AssingmentDto> list=new ArrayList<>();
        ResponseEntity expected = new ResponseEntity(new StandardResponse(200, "true",list), HttpStatus.OK);
        assertEquals(expected, actual);
    }

    @Test
    public void getQuestionsTest(){
        ResponseEntity<StandardResponse> actual = assingmentController.getQuestions("AS100");
        List<QuestionDto> questions = new ArrayList<>();
        ResponseEntity<StandardResponse> expected  = new ResponseEntity(new StandardResponse(200, "true",questions), HttpStatus.OK);
        assertEquals(expected, actual);
    }

    @Test
    public void getOverallGrades(){
        ResponseEntity<StandardResponse> actual = assingmentController.getOverallGrades("asmntId");
        List<GradeDto> grades = new ArrayList<>();
        ResponseEntity<StandardResponse> expected  = new ResponseEntity(new StandardResponse(200, "true",grades), HttpStatus.OK);
        assertEquals(expected, actual);
    }


}
