package kel29._HappyTravelling.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import kel29._HappyTravelling.model.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Boolean existsByRoleName(String rolename);
}
