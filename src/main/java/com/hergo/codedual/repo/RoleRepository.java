package com.hergo.codedual.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hergo.codedual.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByAuthority(String authority);

}
