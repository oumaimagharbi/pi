package tn.esprit.spring.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.esprit.spring.enumuration.Card_type;

@Entity
public class Credit_card implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long referance;
	
	@Enumerated(EnumType.STRING)
	private Card_type card_type ;
	
	@JsonIgnore
	@OneToOne
	private Account account;

	public Credit_card(long referance, Card_type card_type) {
		super();
		this.referance = referance;
		this.card_type = card_type;
	}

	public Credit_card() {
		super();
	}

	public long getReferance() {
		return referance;
	}

	public void setReferance(long referance) {
		this.referance = referance;
	}

	public Card_type getCard_type() {
		return card_type;
	}

	public void setCard_type(Card_type card_type) {
		this.card_type = card_type;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}
