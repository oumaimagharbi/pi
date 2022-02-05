package tn.esprit.spring.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.esprit.spring.enumuration.State_t;
import tn.esprit.spring.enumuration.Type_t;

@Entity
public class Transaction implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_t;
	
	@CreationTimestamp
	private Date date ;
	
	private int amount ;
	
	@Enumerated(EnumType.STRING)
	private Type_t type_t ;
	
	@Enumerated(EnumType.STRING)
	private State_t state_t ;
	
	private int ref_account ;
	
	private int to_ref_account ;
	
	private int step = 1 ;
	
	private  int old_blance_org ;
	
	private int new_balance_org ;
	
	private int old_balance_dest ;
	
	private int new_balance_dest ;
	
	private int case_in = 0 ;
	
	private int case_out = 0 ;
	
	private int payement = 1 ;
	
	private int tranfert = 0 ;
	
	private int fraud = 0 ;
	
	@JsonIgnore
	@ManyToOne
	private Account account;
	

	



	

	public Transaction(long id_t, Date date, int amount, Type_t type_t, State_t state_t, int ref_account,
			int to_ref_account, int step, int old_blance_org, int new_balance_org, int old_balance_dest,
			int new_balance_dest, int case_in, int case_out, int payement, int tranfert, int fraud, Account account) {
		super();
		this.id_t = id_t;
		this.date = date;
		this.amount = amount;
		this.type_t = type_t;
		this.state_t = state_t;
		this.ref_account = ref_account;
		this.to_ref_account = to_ref_account;
		this.step = step;
		this.old_blance_org = old_blance_org;
		this.new_balance_org = new_balance_org;
		this.old_balance_dest = old_balance_dest;
		this.new_balance_dest = new_balance_dest;
		this.case_in = case_in;
		this.case_out = case_out;
		this.payement = payement;
		this.tranfert = tranfert;
		this.fraud = fraud;
		this.account = account;
	}

	public Transaction() {
		super();
	}

	public long getId_t() {
		return id_t;
	}

	public void setId_t(long id_t) {
		this.id_t = id_t;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Type_t getType_t() {
		return type_t;
	}

	public void setType_t(Type_t type_t) {
		this.type_t = type_t;
	}

	public State_t getState_t() {
		return state_t;
	}

	public void setState_t(State_t state_t) {
		this.state_t = state_t;
	}

	public int getRef_account() {
		return ref_account;
	}

	public void setRef_account(int ref_account) {
		this.ref_account = ref_account;
	}

	public int getTo_ref_account() {
		return to_ref_account;
	}

	public void setTo_ref_account(int to_ref_account) {
		this.to_ref_account = to_ref_account;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getOld_blance_org() {
		return old_blance_org;
	}

	public void setOld_blance_org(int old_blance_org) {
		this.old_blance_org = old_blance_org;
	}

	public int getNew_balance_org() {
		return new_balance_org;
	}

	public void setNew_balance_org(int new_balance_org) {
		this.new_balance_org = new_balance_org;
	}

	public int getOld_balance_dest() {
		return old_balance_dest;
	}

	public void setOld_balance_dest(int old_balance_dest) {
		this.old_balance_dest = old_balance_dest;
	}

	public int getNew_balance_dest() {
		return new_balance_dest;
	}

	public void setNew_balance_dest(int new_balance_dest) {
		this.new_balance_dest = new_balance_dest;
	}

	

	public int getCase_in() {
		return case_in;
	}

	public void setCase_in(int case_in) {
		this.case_in = case_in;
	}

	public int getCase_out() {
		return case_out;
	}

	public void setCase_out(int case_out) {
		this.case_out = case_out;
	}

	public int getPayement() {
		return payement;
	}

	public void setPayement(int payement) {
		this.payement = payement;
	}

	public int getTranfert() {
		return tranfert;
	}

	public void setTranfert(int tranfert) {
		this.tranfert = tranfert;
	}

	public int getFraud() {
		return fraud;
	}

	public void setFraud(int fraud) {
		this.fraud = fraud;
	}

	

}
