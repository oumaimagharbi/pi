package tn.esprit.spring.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Compte_titre implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_comp;
	
	private String rib ;
	
	@Temporal (TemporalType.DATE)
	private Date dateCreation ;
	
	private String status ;
	
	private float solde ;
	
	@JsonIgnore
	@ManyToOne
	User user;
	
	@JsonIgnore
	@ManyToOne
	Ordre ordre;
	
	@JsonIgnore
	@ManyToMany(mappedBy="compte_titre", cascade = CascadeType.ALL)
	private Set<Action> actions;
	
	@JsonIgnore
	@ManyToMany(mappedBy="compte_titre", cascade = CascadeType.ALL)
	private Set<Obligation> obligations;


	public Compte_titre(long id_comp, String rib, Date dateCreation, String status, float solde) {
		super();
		this.id_comp = id_comp;
		this.rib = rib;
		this.dateCreation = dateCreation;
		this.status = status;
		this.solde = solde;
	}

	public Compte_titre() {
		super();
	}

	public long getId_comp() {
		return id_comp;
	}

	public void setId_comp(long id_comp) {
		this.id_comp = id_comp;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Action> getActions() {
		return actions;
	}

	public void setActions(Set<Action> actions) {
		this.actions = actions;
	}

	public Set<Obligation> getObligations() {
		return obligations;
	}

	public void setObligations(Set<Obligation> obligations) {
		this.obligations = obligations;
	}

	public Ordre getOrdre() {
		return ordre;
	}

	public void setOrdre(Ordre ordre) {
		this.ordre = ordre;
	}

	
	
	

}
