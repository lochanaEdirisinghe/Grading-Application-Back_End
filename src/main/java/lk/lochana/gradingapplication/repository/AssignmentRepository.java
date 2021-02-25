package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.Assingment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssignmentRepository extends JpaRepository<Assingment, String> {

    @Query(value = "select * from Assingment where teacher=:teacherId", nativeQuery = true)
    List<Assingment> findByteacher(@Param("teacherId") String teacherId);

}
