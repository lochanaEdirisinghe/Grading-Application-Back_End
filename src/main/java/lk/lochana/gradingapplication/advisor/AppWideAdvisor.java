package lk.lochana.gradingapplication.advisor;

import lk.lochana.gradingapplication.dto.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideAdvisor {

    @ExceptionHandler({Exception.class})
    public ResponseEntity handleMyException(Exception ex) {
        return new ResponseEntity(new StandardResponse(500, "Error", ex.getMessage()), HttpStatus.OK);
    }
}
