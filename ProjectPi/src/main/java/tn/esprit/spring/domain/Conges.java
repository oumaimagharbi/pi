package tn.esprit.spring.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Conges implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_c;
	
	private Date date_debut ;
	
	private Date date_fin ;
	
	@JsonIgnore
	@OneToOne(mappedBy="conges")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Conges(long id_c, Date date_debut, Date date_fin) {
		super();
		this.id_c = id_c;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}

	public Conges() {
		super();
	}

	public long getId_c() {
		return id_c;
	}

	public void setId_c(long id_c) {
		this.id_c = id_c;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
	

}
