package tn.esprit.spring.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Action implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_act;
	
	private String ISIN ;
	
	private String stiker ;
	
	private float open ;
	
	private float high ;
	
	private float low ;
	
	private float yield ;
	
	private float close ;
	
	private long volume ;
	
	private float variation ;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Compte_titre> compte_titre;

	public Action(long id_act, String iSIN, String stiker, float open, float high, float low, float yield, float close,
			long volume, float variation) {
		super();
		this.id_act = id_act;
		ISIN = iSIN;
		this.stiker = stiker;
		this.open = open;
		this.high = high;
		this.low = low;
		this.yield = yield;
		this.close = close;
		this.volume = volume;
		this.variation = variation;
	}

	public Action() {
		super();
	}

	public long getId_act() {
		return id_act;
	}

	public void setId_act(long id_act) {
		this.id_act = id_act;
	}

	public String getISIN() {
		return ISIN;
	}

	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}

	public String getStiker() {
		return stiker;
	}

	public void setStiker(String stiker) {
		this.stiker = stiker;
	}

	public float getOpen() {
		return open;
	}

	public void setOpen(float open) {
		this.open = open;
	}

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getLow() {
		return low;
	}

	public void setLow(float low) {
		this.low = low;
	}

	public float getYield() {
		return yield;
	}

	public void setYield(float yield) {
		this.yield = yield;
	}

	public float getClose() {
		return close;
	}

	public void setClose(float close) {
		this.close = close;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public float getVariation() {
		return variation;
	}

	public void setVariation(float variation) {
		this.variation = variation;
	}

	public Set<Compte_titre> getCompte_titre() {
		return compte_titre;
	}

	public void setCompte_titre(Set<Compte_titre> compte_titre) {
		this.compte_titre = compte_titre;
	}
	
	
}
