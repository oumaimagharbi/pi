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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.esprit.spring.enumuration.Authorities_contacted;
import tn.esprit.spring.enumuration.Auto_make;
import tn.esprit.spring.enumuration.Auto_model;
import tn.esprit.spring.enumuration.Collision_type;
import tn.esprit.spring.enumuration.Incident_city;
import tn.esprit.spring.enumuration.Incident_severity;
import tn.esprit.spring.enumuration.Incident_state;
import tn.esprit.spring.enumuration.Incident_type;
import tn.esprit.spring.enumuration.Policy_csl;
import tn.esprit.spring.enumuration.Policy_report_available;
import tn.esprit.spring.enumuration.Policy_state;
import tn.esprit.spring.enumuration.Proprety_damage;
import tn.esprit.spring.enumuration.State;

@Entity
public class Reclamation_assurance implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_r;
	
	@Enumerated(EnumType.STRING)
	private Policy_state policy_state ;
	
	@Enumerated(EnumType.STRING)
	private Policy_csl policy_csl ;
	
	@Enumerated(EnumType.STRING)
	private Incident_type incident_type ;
	
	@Enumerated(EnumType.STRING)
	private Incident_severity incident_severity ;
	
	@Enumerated(EnumType.STRING)
	private Incident_state incident_state ;
	
	@Enumerated(EnumType.STRING)
	private Incident_city incident_city ;
	
	@Enumerated(EnumType.STRING)
	private Auto_make auto_make ;
	
	@Enumerated(EnumType.STRING)
	private Auto_model auto_model ;
	
	@Enumerated(EnumType.STRING)
	private Collision_type collision_type ;
	
	@Enumerated(EnumType.STRING)
	private Proprety_damage proprety_damage ;
	
	@Enumerated(EnumType.STRING)
	private Policy_report_available policy_report_available ;
	
	@Enumerated(EnumType.STRING)
	private Authorities_contacted authorities_contacted ;
	
	private String amount_to_refand ;
	
	@Enumerated(EnumType.STRING)
	private State state = State.waiting ;
	
	private int fraud = 0 ;
	
	@JsonIgnore
	@ManyToMany(mappedBy="reclamation_assurance", cascade = CascadeType.ALL)
	private Set<Account> accounts;

	

	public Reclamation_assurance(long id_r, Policy_state policy_state, Policy_csl policy_csl,
			Incident_type incident_type, Incident_severity incident_severity, Incident_state incident_state,
			Incident_city incident_city, Auto_make auto_make, Auto_model auto_model, Collision_type collision_type,
			Proprety_damage proprety_damage, Policy_report_available policy_report_available,
			Authorities_contacted authorities_contacted, String amount_to_refand, State state, int fraud,
			Set<Account> accounts) {
		super();
		this.id_r = id_r;
		this.policy_state = policy_state;
		this.policy_csl = policy_csl;
		this.incident_type = incident_type;
		this.incident_severity = incident_severity;
		this.incident_state = incident_state;
		this.incident_city = incident_city;
		this.auto_make = auto_make;
		this.auto_model = auto_model;
		this.collision_type = collision_type;
		this.proprety_damage = proprety_damage;
		this.policy_report_available = policy_report_available;
		this.authorities_contacted = authorities_contacted;
		this.amount_to_refand = amount_to_refand;
		this.state = state;
		this.fraud = fraud;
		this.accounts = accounts;
	}

	public Reclamation_assurance() {
		super();
	}

	public long getId_r() {
		return id_r;
	}

	public void setId_r(long id_r) {
		this.id_r = id_r;
	}

	public Policy_state getPolicy_state() {
		return policy_state;
	}

	public void setPolicy_state(Policy_state policy_state) {
		this.policy_state = policy_state;
	}

	public Policy_csl getPolicy_csl() {
		return policy_csl;
	}

	public void setPolicy_csl(Policy_csl policy_csl) {
		this.policy_csl = policy_csl;
	}

	public Incident_type getIncident_type() {
		return incident_type;
	}

	public void setIncident_type(Incident_type incident_type) {
		this.incident_type = incident_type;
	}

	public Incident_severity getIncident_severity() {
		return incident_severity;
	}

	public void setIncident_severity(Incident_severity incident_severity) {
		this.incident_severity = incident_severity;
	}

	public Incident_state getIncident_state() {
		return incident_state;
	}

	public void setIncident_state(Incident_state incident_state) {
		this.incident_state = incident_state;
	}

	public Incident_city getIncident_city() {
		return incident_city;
	}

	public void setIncident_city(Incident_city incident_city) {
		this.incident_city = incident_city;
	}

	public Auto_make getAuto_make() {
		return auto_make;
	}

	public void setAuto_make(Auto_make auto_make) {
		this.auto_make = auto_make;
	}

	public Auto_model getAuto_model() {
		return auto_model;
	}

	public void setAuto_model(Auto_model auto_model) {
		this.auto_model = auto_model;
	}

	public Collision_type getCollision_type() {
		return collision_type;
	}

	public void setCollision_type(Collision_type collision_type) {
		this.collision_type = collision_type;
	}

	public Proprety_damage getProprety_damage() {
		return proprety_damage;
	}

	public void setProprety_damage(Proprety_damage proprety_damage) {
		this.proprety_damage = proprety_damage;
	}

	public Policy_report_available getPolicy_report_available() {
		return policy_report_available;
	}

	public void setPolicy_report_available(Policy_report_available policy_report_available) {
		this.policy_report_available = policy_report_available;
	}

	public Authorities_contacted getAuthorities_contacted() {
		return authorities_contacted;
	}

	public void setAuthorities_contacted(Authorities_contacted authorities_contacted) {
		this.authorities_contacted = authorities_contacted;
	}

	public String getAmount_to_refand() {
		return amount_to_refand;
	}

	public void setAmount_to_refand(String amount_to_refand) {
		this.amount_to_refand = amount_to_refand;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getFraud() {
		return fraud;
	}

	public void setFraud(int fraud) {
		this.fraud = fraud;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	
	

}
