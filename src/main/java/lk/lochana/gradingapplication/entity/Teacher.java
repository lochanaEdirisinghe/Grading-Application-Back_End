package lk.lochana.gradingapplication.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Getter
@Setter
@ToString
public class Teacher {
    @Id
    private String id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "class", referencedColumnName = "id")
    private Class classId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role", referencedColumnName = "id")
    private Role role;

}
