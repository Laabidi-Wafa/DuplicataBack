package com.project.model;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.UniqueConstraint;
	import javax.validation.constraints.Email;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@Entity
	@Table( name="contact")
	public class Contact {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long id;
		

		
		@Size(max = 20)
		private String nom;
		
		
		@Size(max = 50)
		@Email
		private String email;
		
		
		@Size(max = 120)
		private String sujet;
		
		@Size(max = 120)
		private String description;

		public Contact(Long id, String nom, String email,String sujet, String description) {
			super();
			this.id = id;
			this.nom = nom;
			this.email = email;
			this.sujet = sujet;
			this.description = description;
		}

		public Contact() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSujet() {
			return sujet;
		}

		public void setSujet(String sujet) {
			this.sujet = sujet;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
	}

