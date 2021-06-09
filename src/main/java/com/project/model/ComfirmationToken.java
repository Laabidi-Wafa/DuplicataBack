package com.project.model;


import java.util.Date;
import java.util.UUID;
import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class ComfirmationToken {	   
	    	@Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    @Column(name="token_id")
		    private Long tokenid;


		    @Column(name="confirmation_token")
		    private String confirmationToken;

		    @Temporal(TemporalType.TIMESTAMP)
		    private Date createdDate;
		    
		    @OnDelete(action = OnDeleteAction.CASCADE)
		    @OneToOne(targetEntity = Utilisateur.class, fetch = FetchType.EAGER)
		    @JoinColumn(nullable = true,referencedColumnName="id", name = "user_id")
		    private Utilisateur user;

		    public ComfirmationToken() {
				super();
			}

			public ComfirmationToken(long tokenid, String confirmationToken, Date createdDate) {
				super();
				this.tokenid = tokenid;
				this.confirmationToken = confirmationToken;
				this.createdDate = createdDate;
			}

			public  ComfirmationToken(Utilisateur user) {
		        this.user = user;
		        createdDate = new Date();
		        confirmationToken = UUID.randomUUID().toString();
		    }

			public ComfirmationToken(Contact contactsend) {
			        createdDate = new Date();
			        confirmationToken = UUID.randomUUID().toString();
			}

			public String getConfirmationToken() {
				return confirmationToken;
			}

			public void setConfirmationToken(String confirmationToken) {
				this.confirmationToken = confirmationToken;
			}

		   public Utilisateur getUser() {
		   return user;
		    }

		   public void setUser(Utilisateur user) {
		   this.user = user;
		     }
		    

	}
