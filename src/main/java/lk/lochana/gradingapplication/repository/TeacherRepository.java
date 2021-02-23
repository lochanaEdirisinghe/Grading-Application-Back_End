package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.Student;
import lk.lochana.gradingapplication.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, String> {

    @Query(value = "select EXISTS (select * from teacher where user_name=:username)", nativeQuery = true)
    int existByusername(@Param("username") String username);

    @Query(value = "select * from teacher where user_name=:username", nativeQuery = true)
    Optional<Teacher> findByusername(@Param("username") String username);

}
