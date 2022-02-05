package tn.esprit.spring.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.esprit.spring.enumuration.Type_ordre;

@Entity
public class Ordre implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_o;
	
	@Enumerated(EnumType.STRING)
	private Type_ordre type_ordre ;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="ordre")
	private Set<Compte_titre> compte_titres;

	

	public long getId_o() {
		return id_o;
	}

	public void setId_o(long id_o) {
		this.id_o = id_o;
	}

	public Type_ordre getType_ordre() {
		return type_ordre;
	}

	public void setType_ordre(Type_ordre type_ordre) {
		this.type_ordre = type_ordre;
	}

	public Set<Compte_titre> getCompte_titres() {
		return compte_titres;
	}

	public void setCompte_titres(Set<Compte_titre> compte_titres) {
		this.compte_titres = compte_titres;
	}

	
	
	

}
