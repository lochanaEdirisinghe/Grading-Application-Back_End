package lk.lochana.gradingapplication.controller;

import lk.lochana.gradingapplication.dto.MarksDto;
import lk.lochana.gradingapplication.dto.StandardResponse;
import lk.lochana.gradingapplication.dto.StudentDto;
import lk.lochana.gradingapplication.service.StudentService;
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
public class StudentControllerTest {

    @Autowired
    private StudentController studentController;

    @MockBean
    private StudentService studentService;


    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void searchStudentTest(){
        ResponseEntity<StandardResponse> actual = studentController.searchStudent("kamal");
        ResponseEntity<StandardResponse> expected= new ResponseEntity(new StandardResponse(200, "true", new StudentDto()), HttpStatus.OK);
        assertEquals(expected, actual);
    }

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void getMarksTest(){
        ResponseEntity<StandardResponse> actual = studentController.getMarks("studentID", "asmntId", 1);
        ResponseEntity<StandardResponse> expected= new ResponseEntity(new StandardResponse(200, "true", new MarksDto()), HttpStatus.OK);
        assertEquals(expected, actual);
    }

}
