package com.project.model;
	import java.util.Date;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

	import org.hibernate.annotations.OnDelete;
	import org.hibernate.annotations.OnDeleteAction;

	@Entity
	@Table(name = "demandepe")
	public class Demandepermis {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;

	@NotBlank
	@Size(max = 8)
	private Number cin;

	private Date date_perte;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String etat;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private Date date;
	
	@OnDelete(action = OnDeleteAction.CASCADE)
	@ManyToOne(fetch=FetchType.EAGER,optional= true)
	private Utilisateur Citoyen;

	public Demandepermis() {
		createdDate = new Date();
	}
	
	public Number getCin() {
		return cin;
	}

	public void setCin(Number cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Demandepermis(Long id, @NotBlank @Size(max = 8) Number cin, Date date_perte, Date createdDate, String etat,
			String nom, String prenom, String adresse, Date date, Utilisateur citoyen) {
		super();
		this.id = id;
		this.cin = cin;
		this.date_perte = date_perte;
		this.createdDate = createdDate;
		this.etat = etat;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.date = date;
		Citoyen = citoyen;
	}


	}