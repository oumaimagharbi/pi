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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Obligation implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_ob;
	
	private int valeurnominale ;
	
	@Temporal (TemporalType.DATE)
	private Date dataEmission ;
	
	private  int tauxActuariel ;
	
	private int volume ;
	
	private int variation ;
	
	private  int coupon ;
	
	private int nombreannee ;
	
	private int valeuractuelle;
	
	private String nomEntreprise ;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Compte_titre> compte_titre;

	

	public Obligation() {
		super();
	}



	public Obligation(long id_ob, int valeurnominale, Date dataEmission, int tauxActuariel, int volume, int variation,
			int coupon, int nombreannee, int valeuractuelle, String nomEntreprise, Set<Compte_titre> compte_titre) {
		super();
		this.id_ob = id_ob;
		this.valeurnominale = valeurnominale;
		this.dataEmission = dataEmission;
		this.tauxActuariel = tauxActuariel;
		this.volume = volume;
		this.variation = variation;
		this.coupon = coupon;
		this.nombreannee = nombreannee;
		this.valeuractuelle = valeuractuelle;
		this.nomEntreprise = nomEntreprise;
		this.compte_titre = compte_titre;
	}



	public long getId_ob() {
		return id_ob;
	}



	public void setId_ob(long id_ob) {
		this.id_ob = id_ob;
	}



	public int getValeurnominale() {
		return valeurnominale;
	}



	public void setValeurnominale(int valeurnominale) {
		this.valeurnominale = valeurnominale;
	}



	public Date getDataEmission() {
		return dataEmission;
	}



	public void setDataEmission(Date dataEmission) {
		this.dataEmission = dataEmission;
	}



	public int getTauxActuariel() {
		return tauxActuariel;
	}



	public void setTauxActuariel(int tauxActuariel) {
		this.tauxActuariel = tauxActuariel;
	}



	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		this.volume = volume;
	}



	public int getVariation() {
		return variation;
	}



	public void setVariation(int variation) {
		this.variation = variation;
	}



	public int getCoupon() {
		return coupon;
	}



	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}



	public int getNombreannee() {
		return nombreannee;
	}



	public void setNombreannee(int nombreannee) {
		this.nombreannee = nombreannee;
	}



	public int getValeuractuelle() {
		return valeuractuelle;
	}



	public void setValeuractuelle(int valeuractuelle) {
		this.valeuractuelle = valeuractuelle;
	}



	public String getNomEntreprise() {
		return nomEntreprise;
	}



	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}



	public Set<Compte_titre> getCompte_titre() {
		return compte_titre;
	}



	public void setCompte_titre(Set<Compte_titre> compte_titre) {
		this.compte_titre = compte_titre;
	}

	
	
	

}
