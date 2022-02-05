package tn.esprit.spring.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.esprit.spring.enumuration.Etat;



@Entity
public class Message implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_msg;
	
	private String content ;
	
	private String subject ;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_rep ;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_envoi ;
	
	private String reponse ;
	
	@Column(length = 32, columnDefinition = "varchar(32) default 'waiting'")
	@Enumerated(EnumType.STRING)
	private Etat etat = Etat.nonrepondu ;
	
	@JsonIgnore
	@ManyToOne
    private User user;
	
	public static final long MAGIC=86400000L;
	
	public int DateToDays (Date date_envoi){
	    //  convert a date to an integer and back again
	    long currentTime=date_envoi.getTime();
	    currentTime=currentTime/MAGIC;
	    return (int) currentTime; 
	}

	

	

	public Message(long id_msg, String content, String subject, Date date_rep, Date date_envoi, String reponse,
			Etat etat, User user) {
		super();
		this.id_msg = id_msg;
		this.content = content;
		this.subject = subject;
		this.date_rep = date_rep;
		this.date_envoi = date_envoi;
		this.reponse = reponse;
		this.etat = etat;
		this.user = user;
	}





	public Date getDate_rep() {
		return date_rep;
	}





	public void setDate_rep(Date date_rep) {
		this.date_rep = date_rep;
	}





	public Message() {
		super();
	}

	public long getId_msg() {
		return id_msg;
	}

	public void setId_msg(long id_msg) {
		this.id_msg = id_msg;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDate_envoi() {
		return date_envoi;
	}

	public void setDate_envoi(Date date_envoi) {
		this.date_envoi = date_envoi;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	
	

}
