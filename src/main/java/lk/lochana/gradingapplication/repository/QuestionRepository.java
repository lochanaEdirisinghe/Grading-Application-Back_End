package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.Assingment;
import lk.lochana.gradingapplication.entity.Question;
import lk.lochana.gradingapplication.entity.QuestionPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, QuestionPK> {

    @Query(value = "select * from question where asmnt_id=:asmntId", nativeQuery = true)
    List<Question> findByasmnt(@Param("asmntId") String asmntId);

}
