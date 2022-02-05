package tn.esprit.spring.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long referance;
	
	private int balance ;
	
	private int old_balance ;
	
	@JsonIgnore
	@OneToOne
	private User user;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Reclamation_assurance> reclamation_assurance;
	
	@JsonIgnore
	@OneToOne(mappedBy="account")
	private Credit_card credit_card;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="account")
	private Set<Transaction> transactions;

	

	public Account(long referance, int balance, int old_balance, User user,
			Set<Reclamation_assurance> reclamation_assurance, Credit_card credit_card, Set<Transaction> transactions) {
		super();
		this.referance = referance;
		this.balance = balance;
		this.old_balance = old_balance;
		this.user = user;
		this.reclamation_assurance = reclamation_assurance;
		this.credit_card = credit_card;
		this.transactions = transactions;
	}

	public Account() {
		super();
	}

	public long getReferance() {
		return referance;
	}

	public void setReferance(long referance) {
		this.referance = referance;
	}

	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getOld_balance() {
		return old_balance;
	}

	public void setOld_balance(int old_balance) {
		this.old_balance = old_balance;
	}

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Credit_card getCredit_card() {
		return credit_card;
	}

	public void setCredit_card(Credit_card credit_card) {
		this.credit_card = credit_card;
	}

	public Set<Reclamation_assurance> getReclamation_assurance() {
		return reclamation_assurance;
	}

	public void setReclamation_assurance(Set<Reclamation_assurance> reclamation_assurance) {
		this.reclamation_assurance = reclamation_assurance;
	}
	
	

}
