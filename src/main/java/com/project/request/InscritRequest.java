package com.project.request;
import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.project.model.Role;



public class InscritRequest {
	    @NotBlank
	    @Size(min = 3, max = 20)
	    private String username;
	
	   @NotBlank
	   @Size(min=3 ,max = 20)
	   private String prenom;
	   
	    @NotBlank
	    @Size(max = 50)
	    @Email
	    private String email;

	   @NotBlank
	   @Size(min = 8, max = 12)
	   private String password;
	   
	   private Date date;
		
	   private String sexe;
	 
	   @Size(min = 8, max = 12)
	   private String tel;
	  
	   private Role role;
	    
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

public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date=date;
}
public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe=sexe;
}

public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

}




