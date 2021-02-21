package lk.lochana.gradingapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class JwtResponse {

    private String jwt;
    private String username;
    private List<String> roles;
}