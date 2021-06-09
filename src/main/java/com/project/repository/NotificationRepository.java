package com.project.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Notification;


public interface NotificationRepository extends JpaRepository <Notification ,Long> {
	public Optional <Notification> findById(Long id);
	

}

