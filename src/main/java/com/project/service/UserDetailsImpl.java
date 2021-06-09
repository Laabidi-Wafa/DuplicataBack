package com.project.service;
	import java.sql.Date;
	import java.util.Arrays;
	import java.util.Collection;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Objects;
	import java.util.Set;
	import java.util.stream.Collectors;
	import org.springframework.security.core.GrantedAuthority;
	import org.springframework.security.core.authority.SimpleGrantedAuthority;
	import org.springframework.security.core.userdetails.UserDetails;

	import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.model.Role;
import com.project.model.Utilisateur;


	public class UserDetailsImpl implements UserDetails {
		private static final long serialVersionUID = 1L;

		private Long id;

		private String username;
		
		private String prenom;
		
		private Date date;
		
	    private String sexe;

		private String email;

		@JsonIgnore
		private String password;
		
		private String tel ;
		

		private Collection<? extends GrantedAuthority> authorities;


		public UserDetailsImpl(Long id, String username,String prenom,
				String email, String password,Date date, String sexe,String tel ,
				Collection<? extends GrantedAuthority> authorities) {
			this.id = id;
			this.username = username;
			this.prenom=prenom;
			this.email = email;
			this.password = password;
			this.date=date;
			this.sexe=sexe;
			this.tel=tel;
			this.authorities = authorities;
			
		}
		public static UserDetailsImpl build(Utilisateur user) {
			List<Role> listrole=Arrays.asList(user.getRole());
			Set<Role> targetSet = new HashSet<>(listrole);
			List<GrantedAuthority> authorities =targetSet.stream()
					.map(role -> new SimpleGrantedAuthority(role.getName().name()))
					.collect(Collectors.toList());
			return new UserDetailsImpl(
					user.getId(), 
					user.getUsername(), 
					user.getPrenom(),
					user.getEmail(),
					user.getPassword(), 
					user.getDate(),
					user.getSexe(),
					user.getTel(),
					authorities);}
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return authorities;
		}

		public Long getId() {
			return id;
		}

		public String getEmail() {
			return email;
		}

		@Override
		public String getPassword() {
			return password;
		}

		@Override
		public String getUsername() {
			return username;
		}
		
		public String getPrenom() {
			return prenom;
		}
		
		public String getSexe() {
			return sexe;
		}
		
		public Date getDate() {
			return date;
		}

		public String getTel() {
			return tel;
		}


		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			UserDetailsImpl user = (UserDetailsImpl) o;
			return Objects.equals(id, user.id);
		}
		
	}
