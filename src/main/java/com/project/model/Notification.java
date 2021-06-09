package com.project.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

	@Entity
	public class Notification {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		private String titre;
		
		private String Description;
		@OnDelete(action = OnDeleteAction.CASCADE)
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "id_u")
	    private Utilisateur user;

		
		public Notification() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Notification(long id, String titre, String Description) {
			super();
			this.id = id;
			this.titre = titre;
			this.Description = Description;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitre() {
			return titre;
		}

		public void setTitre(String titre) {
			this.titre = titre;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String Description) {
			this.Description = Description;
		}
		
		

	}
