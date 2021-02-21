package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, String> {

    @Query(value = "select EXISTS (select * from Student where user_name=:username)", nativeQuery = true)
    int existByusername(@Param("username") String username);

    @Query(value = "select * from Student where user_name=:username", nativeQuery = true)
    Optional<Student> findByusername(@Param("username") String username);

    //Optional<Student> findStudentByUser(String name);
}
