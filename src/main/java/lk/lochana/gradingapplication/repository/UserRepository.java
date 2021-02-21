package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsername(String name);
}
