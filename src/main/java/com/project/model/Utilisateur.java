package com.project.model;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
@Table(	name = "Utilisateur", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "email") 
		})
public class Utilisateur {
	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 	public Long id;

	 	@NotBlank
	 	@Size(max = 20)
	 	private String username;
	 	
	 	@NotBlank
	 	@Size(max = 20)
	 	private String prenom;

	 	@NotBlank
	 	@Size(max = 50)
	 	@Email
	 	private String email;

	 	@NotBlank
	 	@Size(max = 120)
	 	private String password;
	 	
	 	private Date date;
	 	
	 	@Column(name="sexe")
	 	private String sexe;
	 	
	 	private String tel;
	 	
	     private boolean isEnabled;

	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @ManyToOne(targetEntity=Role.class, fetch=FetchType.EAGER,optional= true)
	    @JoinColumn(name = "Role_id",referencedColumnName="id",nullable=false)
	    private Role role ;
	    
	 public Utilisateur() {
	 }
	 public Utilisateur( String username,String prenom,String email,String password,Date date,String sexe,String tel) {
	 	    this.username = username;
	 		this.prenom = prenom;
	 		this.email = email;
	 		this.password = password;
	 		this.date= date;
	 		this.sexe=sexe;
	 		this.tel = tel;	
	 	}
	 public Utilisateur(String username, String prenom, String email, String password, String tel) {
	 		this.username = username;
	 		this.prenom = prenom;
	 		this.email = email;
	 		this.password = password;
	 		this.tel = tel;	
	 }
	 	public Long getId() {
	 		return id;
	 	}
	 	public void setId(Long id) {
	 		this.id = id;
	 	}
	 	public String getUsername() {
	 		return username;
	 	}
	 	public void setUsername(String username) {
	 		this.username = username;
	 	}
	 	public String getPrenom() {
	 		return prenom;
	 	}

	 	public void setPrenom(String prenom) {
	 		this.prenom = prenom;
	 	}
	 	public Date getDate() {
	 		return date;
	 	}
	 	public void setDate(Date date) {
	 		this.date = date;
	 	}
	 	public String getSexe() {
	 		return sexe;
	 	}
	 	public void setSexe(String sexe) {
	 		this.sexe = sexe;
	 	}

	 	public String getEmail() {
	 		return email;
	 	}

	 	public void setEmail(String email) {
	 		this.email = email;
	 	}

	 	public String getPassword() {
	 		return password;
	 	}

	 	public void setPassword(String password) {
	 		this.password = password;
	 	}

	 	public String getTel() {
	 		return tel;
	 	}

	 	public void setTel(String tel) {
	 		this.tel = tel;
	 	}
	 	public boolean isEnabled() {
	 		return isEnabled;
	 	}

	 	public void setEnabled(boolean isEnabled) {
	 		this.isEnabled = isEnabled;
	 	}

	     public Role getRole() {
	 	return role;
	 	}
	 	public void setRole(Role role) {
	 	this.role =  role;
	 	}
	 	public void save(Long userconnect) {
	 		// TODO Auto-generated method stub
	 		
	 	}


}
