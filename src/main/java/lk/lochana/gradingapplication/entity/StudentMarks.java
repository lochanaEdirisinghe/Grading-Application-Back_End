package lk.lochana.gradingapplication.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentMarks {

    @EmbeddedId
    private StudentMarksPK marksPK;

    @MapsId("student_id")
    @ManyToOne
    private Student student;

    @MapsId("asmnt_id")
    @ManyToOne
    private Assingment assingment;

    private String result;
    private String answer;
    private String timeSpent;
    private String noOfAttempts;

}
