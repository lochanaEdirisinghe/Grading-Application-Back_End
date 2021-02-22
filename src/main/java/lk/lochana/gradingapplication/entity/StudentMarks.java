package lk.lochana.gradingapplication.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentMarks {

    @EmbeddedId
    private StudentMarksPK marksPK;

    @MapsId("sId")
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @MapsId("asmntId")
    @ManyToOne
    @JoinColumn(name = "asmnt_id")
    private Assingment assingment;

    private String result;
    private String answer;
    private Time timeSpent;
    private String noOfAttempts;

}
