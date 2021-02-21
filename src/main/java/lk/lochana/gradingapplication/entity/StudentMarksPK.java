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

    private String sId;
    private String asmntId;
    private int qNo;
}
