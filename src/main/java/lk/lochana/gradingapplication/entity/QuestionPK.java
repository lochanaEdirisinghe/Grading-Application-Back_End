package lk.lochana.gradingapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;


@Data
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class QuestionPK implements Serializable {

    @Column(name = "asmnt_id")
    private String asmntId;
    private int qNo;
}
