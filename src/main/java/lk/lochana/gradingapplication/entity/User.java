package lk.lochana.gradingapplication.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @Column(name = "user_name")
    private String username;
    private String password;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role", referencedColumnName = "id")
    private Role role;

}
