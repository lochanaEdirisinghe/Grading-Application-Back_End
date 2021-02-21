package lk.lochana.gradingapplication.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Assingment {
    @Id
    @Column(name = "asmnt_id")
    private String asmntId;
    @Column(name = "asmnt_name")
    private String asmntName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher", referencedColumnName = "id")
    private Teacher teacher;
}
