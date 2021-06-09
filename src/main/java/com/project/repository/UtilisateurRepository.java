package com.project.repository;

import java.util.List;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Utilisateur;



public interface UtilisateurRepository extends JpaRepository <Utilisateur ,Long> {
	
	public List<Utilisateur> findAll();
	public Optional<Utilisateur>findById(Long id);
	Optional<Utilisateur> findByUsername(String username);
	Optional<Utilisateur> findByEmail(String email);
	List <Utilisateur> findByRole(Long Role_id);
	List <Utilisateur> findByRoleId(Long Role_id);
	void   deleteById(Long id);
	Utilisateur findByEmailIgnoreCase(String email);
	Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
	public Utilisateur findUserById(Long id);
	public Utilisateur findUserById(Object id);
	public Utilisateur findUserByUsername(String username);

}

