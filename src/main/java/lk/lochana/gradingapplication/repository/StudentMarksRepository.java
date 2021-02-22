package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.StudentMarks;
import lk.lochana.gradingapplication.entity.StudentMarksPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentMarksRepository extends JpaRepository<StudentMarks, StudentMarksPK> {


    @Query(value = "select * from student_marks where asmnt_id=:asmntId and q_no=:qNo", nativeQuery = true)
    List<StudentMarks> findAllByAsmnt(@Param("asmntId") String asmentId, @Param("qNo") int qNo);

}
