package lk.lochana.gradingapplication.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Class {

    @Id
    private String id;
    private String name;
    @OneToOne(mappedBy = "classId")
    private Teacher teacher;
    @OneToMany(mappedBy = "classId")
    private Set<Student> students;
}
