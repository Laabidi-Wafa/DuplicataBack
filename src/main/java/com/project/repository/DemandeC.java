package com.project.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.DemandeCartegris;





@Repository
public interface DemandeC extends  JpaRepository <DemandeCartegris,Long>{
	public List<DemandeCartegris> findAll(); 
	public Optional<DemandeCartegris> findById(Long id);

}
