package tn.esprit.spring.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Salaire implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_s;
	
	private int salaire ;
	
	@JsonIgnore
	@OneToOne(mappedBy="salaire")
	private User user;

	public Salaire(long id_s, int salaire) {
		super();
		this.id_s = id_s;
		this.salaire = salaire;
	}

	public Salaire() {
		super();
	}

	public long getId_s() {
		return id_s;
	}

	public void setId_s(long id_s) {
		this.id_s = id_s;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
