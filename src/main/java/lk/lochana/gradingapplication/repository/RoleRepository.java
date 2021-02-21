package lk.lochana.gradingapplication.repository;

import lk.lochana.gradingapplication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
