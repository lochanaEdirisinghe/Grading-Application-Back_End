package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.StudentMarks;
import lk.lochana.gradingapplication.entity.StudentMarksPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SrudentMarksRepository extends JpaRepository<StudentMarks, StudentMarksPK> {

    @Query(value = "select * from student_marks where asmnt_id=:asmntId and student_id=:studentId and q_no=:qNo", nativeQuery = true)
    Optional<StudentMarks> findByIdpk(@Param("studentId") String studentId, @Param("asmntId") String asmntId, @Param("qNo") int qNo);


}
