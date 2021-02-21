package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, String> {

    Optional<Student> findStudentByUser(String name);
}
