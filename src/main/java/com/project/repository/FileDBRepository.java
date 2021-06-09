package com.project.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.FileInfo;
import com.project.model.Utilisateur;

@Repository
	public interface FileDBRepository extends JpaRepository<FileInfo, String> {
	public Optional<FileInfo>findById(Long id);

	}


