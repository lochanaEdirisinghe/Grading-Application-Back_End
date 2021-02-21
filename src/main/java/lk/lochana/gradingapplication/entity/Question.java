package lk.lochana.gradingapplication.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @EmbeddedId
    private QuestionPK questionPK;
    @MapsId("asmnt_id")
    @ManyToOne
    private Assingment assingment;
    private String question;
    private String answer;

}
