package com.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.project.model.ComfirmationToken;


public interface ConfirmationTokenRepository extends CrudRepository<ComfirmationToken, String> {
	    ComfirmationToken findByConfirmationToken(String confirmationToken);
	    public List< ComfirmationToken> findAll();
	}


