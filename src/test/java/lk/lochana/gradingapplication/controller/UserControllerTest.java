package lk.lochana.gradingapplication.controller;


import lk.lochana.gradingapplication.dto.JwtResponse;
import lk.lochana.gradingapplication.dto.LoginRequest;
import lk.lochana.gradingapplication.dto.StandardResponse;
import lk.lochana.gradingapplication.repository.UserRepository;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @MockBean
    private UserRepository userRepository;

    @Test(expected = InternalAuthenticationServiceException.class)
    public void authenticateUser(){
        List<String> roles=new ArrayList<>();
        ResponseEntity<StandardResponse> actual = userController.authenticateUser(new LoginRequest());
        ResponseEntity<StandardResponse> expected = ResponseEntity.ok(new StandardResponse(200, "true", new JwtResponse("lkmadamda9i4923", "kamal", roles)));
        assertEquals(expected, actual);
    }

}
