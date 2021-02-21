package lk.lochana.gradingapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuestionDto {
    private int qNo;
    private String question;
    private String answer;
}
