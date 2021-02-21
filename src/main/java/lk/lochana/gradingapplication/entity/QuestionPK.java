package lk.lochana.gradingapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.Embeddable;
import java.io.Serializable;


@Data
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class QuestionPK implements Serializable {
    private String asmntId;
    private int qNo;
}
