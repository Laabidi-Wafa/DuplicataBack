package com.project.model;
	import java.util.Date;
	import javax.persistence.*;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

	import org.hibernate.annotations.OnDelete;
	import org.hibernate.annotations.OnDeleteAction;


	@Entity
	@Table(name = "demandec")
	public class DemandeCartegris {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)	
		private Long id;
		@NotBlank
		@Size(max = 20)
		private String matricule;
		private Date date_perte;

		@Temporal(TemporalType.TIMESTAMP)
		private Date createdDate;
	    private String etat;

	@OnDelete(action = OnDeleteAction.CASCADE)
	@ManyToOne( fetch=FetchType.EAGER,optional= true)
	private Utilisateur Citoyen;

	public DemandeCartegris() {
		   createdDate = new Date();
		}
	public DemandeCartegris(Long id,String matricule, Date date_perte,Date createdDate, String etat) {
			this.id = id;
			this.matricule = matricule;
			this.date_perte = date_perte;
			this.createdDate=createdDate;		
			this.etat= etat;
			
		}
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		
		public String getMatricule() {
			return matricule;
		}
		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}
		public Date getDate_perte() {
			return date_perte;
		}
		public void setDate_perte(Date date_perte) {
			this.date_perte = date_perte;
		}
		public Date getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}

		public String getEtat() {
			return etat;
		}

		public void setEtat(String etat) {
			this.etat = etat;
		}
		public Utilisateur getCitoyen() {
			return Citoyen;
		}
		public void setCitoyen(Utilisateur citoyen) {
			Citoyen = citoyen;
		}
	
		
			
	}


