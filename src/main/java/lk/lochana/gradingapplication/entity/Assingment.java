package lk.lochana.gradingapplication.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
    @Column(name = "asmnt_type")
    private String asmntType;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher", referencedColumnName = "id")
    private Teacher teacher;
}
