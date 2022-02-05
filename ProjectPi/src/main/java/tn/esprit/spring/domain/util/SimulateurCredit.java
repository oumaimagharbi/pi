package tn.esprit.spring.domain.util;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class SimulateurCredit implements Serializable{
	

	private String typedefinancement;
	private int totaleprixacquisition;
	private int apportpropre;
	private int revenubrut;
	private String mensualiteautresfinancements;
	private int dureederemboursement;
	private int puissancefiscale ;
	private String typedevehicule;
	
	
   


	



	public SimulateurCredit(String typedefinancement, int totaleprixacquisition, int apportpropre, int revenubrut,
			String mensualiteautresfinancements, int dureederemboursement, int puissancefiscale,
			String typedevehicule) {
		super();
		this.typedefinancement = typedefinancement;
		this.totaleprixacquisition = totaleprixacquisition;
		this.apportpropre = apportpropre;
		this.revenubrut = revenubrut;
		this.mensualiteautresfinancements = mensualiteautresfinancements;
		this.dureederemboursement = dureederemboursement;
		this.puissancefiscale = puissancefiscale;
		this.typedevehicule = typedevehicule;
	}




	public SimulateurCredit() {
		super();
	}




	public String getTypedefinancement() {
		return typedefinancement;
	}


	public void setTypedefinancement(String typedefinancement) {
		this.typedefinancement = typedefinancement;
	}


	public int getTotaleprixacquisition() {
		return totaleprixacquisition;
	}


	public void setTotaleprixacquisition(int totaleprixacquisition) {
		this.totaleprixacquisition = totaleprixacquisition;
	}


	public int getApportpropre() {
		return apportpropre;
	}


	public void setApportpropre(int apportpropre) {
		this.apportpropre = apportpropre;
	}


	public int getRevenubrut() {
		return revenubrut;
	}


	public void setRevenubrut(int revenubrut) {
		this.revenubrut = revenubrut;
	}


	public String getMensualiteautresfinancements() {
		return mensualiteautresfinancements;
	}


	public void setMensualiteautresfinancements(String mensualiteautresfinancements) {
		this.mensualiteautresfinancements = mensualiteautresfinancements;
	}


	public int getDureederemboursement() {
		return dureederemboursement;
	}


	public void setDureederemboursement(int dureederemboursement) {
		this.dureederemboursement = dureederemboursement;
	}


	public int getPuissancefiscale() {
		return puissancefiscale;
	}


	public void setPuissancefiscale(int puissancefiscale) {
		this.puissancefiscale = puissancefiscale;
	}


	public String getTypedevehicule() {
		return typedevehicule;
	}


	public void setTypedevehicule(String typedevehicule) {
		this.typedevehicule = typedevehicule;
	}






	
	
	

}
