package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
}
