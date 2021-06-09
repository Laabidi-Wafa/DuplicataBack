package com.project.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.ERole;
import com.project.model.Role;


public interface RoleRepository extends JpaRepository<Role,Long> {

		Optional<Role> findByName(ERole name);
		public Optional<Role>findById(Long id);	
	}