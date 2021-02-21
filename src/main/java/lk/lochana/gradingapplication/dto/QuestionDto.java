package lk.lochana.gradingapplication.dto;

import lk.lochana.gradingapplication.entity.QuestionPK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {
    private QuestionPK questionPK;
    private String question;
    private String answer;
}
