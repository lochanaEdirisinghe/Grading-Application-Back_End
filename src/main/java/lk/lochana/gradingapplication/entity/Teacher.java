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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_name", referencedColumnName = "user_name")
    private User user;

}
