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
    @MapsId("asmntId")
    @ManyToOne
    @JoinColumn(name = "asmnt_id")
    private Assingment assingment;
    private String question;
    private String answer;

}
