package tn.esprit.spring.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Formation implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_;
	
	private String nom ;
	
	private Date date_debut ;
	
	private Date date_fin ;
	
	@JsonIgnore
	@ManyToOne
	private User user;

	public Formation(long id_, String nom, Date date_debut, Date date_fin) {
		super();
		this.id_ = id_;
		this.nom = nom;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}

	public Formation() {
		super();
	}

	public long getId_() {
		return id_;
	}

	public void setId_(long id_) {
		this.id_ = id_;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	

}
