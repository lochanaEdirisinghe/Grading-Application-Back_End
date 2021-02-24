package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.GradeDetails;
import lk.lochana.gradingapplication.entity.GradeDetailsPK;
import lk.lochana.gradingapplication.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GradeDetailRepository extends JpaRepository<GradeDetails, GradeDetailsPK> {

    @Query(value = "select * from grade_details where asmnt_id=:asmntId", nativeQuery = true)
    List<GradeDetails> findAllByasmntId(@Param("asmntId") String asmntId);


}
