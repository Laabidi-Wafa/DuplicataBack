package com.project.repository;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Contact;


	public interface ContactRepository extends JpaRepository  <Contact ,Long>{
		
		public List<Contact> findAll();
		public Optional<Contact>findById(Long id);
		

	}
