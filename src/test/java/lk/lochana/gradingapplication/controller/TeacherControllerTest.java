package lk.lochana.gradingapplication.controller;

import lk.lochana.gradingapplication.dto.OverallMarksDto;
import lk.lochana.gradingapplication.dto.StandardResponse;
import lk.lochana.gradingapplication.dto.TeacherDto;
import lk.lochana.gradingapplication.service.TeacherService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TeacherControllerTest {

    @Autowired
    private TeacherController teacherController;

    @MockBean
    private TeacherService teacherService;

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void searchTeacherTest(){
        ResponseEntity<StandardResponse> actual = teacherController.searchTeacher("chamari");
        ResponseEntity<StandardResponse> expected = new ResponseEntity(new StandardResponse(200, "true", new TeacherDto()), HttpStatus.OK);
        assertEquals(expected, actual);
    }

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void getOverallMarksTest(){
        ResponseEntity<StandardResponse> actual = teacherController.getOverallMarks("asmentId", 1);
        ResponseEntity<StandardResponse> expected = new ResponseEntity(new StandardResponse(200, "true", new OverallMarksDto()), HttpStatus.OK);
        assertEquals(expected, actual);
    }

}
