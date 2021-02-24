package lk.lochana.gradingapplication.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class GradeDetails{
    @EmbeddedId
    private GradeDetailsPK gradeDetailsPK;

    @MapsId("studentId")
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @MapsId("asmntId")
    @ManyToOne
    @JoinColumn(name = "asmnt_id")
    private Assingment assingment;

    private String grade;
}
