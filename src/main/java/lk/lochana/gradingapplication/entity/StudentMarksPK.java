package lk.lochana.gradingapplication.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class StudentMarksPK implements Serializable {

    @Column(name = "student_id")
    private String sId;
    @Column(name = "asmnt_id")
    private String asmntId;
    private int qNo;
}
