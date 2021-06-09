package com.project.service;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.security.core.userdetails.UserDetails;
	import org.springframework.security.core.userdetails.UserDetailsService;
	import org.springframework.security.core.userdetails.UsernameNotFoundException;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import com.project.model.Utilisateur;
import com.project.repository.UtilisateurRepository;




	@Service
	public class UserDetailsServiceImpl implements UserDetailsService {
		@Autowired
		UtilisateurRepository userRepository;

		@Override
		@Transactional
		public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
			Utilisateur user = userRepository.findByEmail(email)
					.orElseThrow(() -> new UsernameNotFoundException("utilisateur n'est existe pas de cette email: " + email));

			return UserDetailsImpl.build(user);
		}
		public UserDetails loadUserById(Long Id) throws UsernameNotFoundException {
			Utilisateur user = userRepository.findById(Id)
					.orElseThrow(() -> new UsernameNotFoundException("utilisateur n'est existe pas de cette email: " + Id));

			return UserDetailsImpl.build(user);
		}
	}

