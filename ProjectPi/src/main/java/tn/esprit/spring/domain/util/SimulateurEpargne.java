package tn.esprit.spring.domain.util;

public class SimulateurEpargne {
	
	private int capitalinitiale;
	private int versement;
	private int rendementespere;
	private int duree ;
	

	public SimulateurEpargne(int capitalinitiale, int versement, int rendementespere, int duree) {
		super();
		this.capitalinitiale = capitalinitiale;
		this.versement = versement;
		this.rendementespere = rendementespere;
		this.duree = duree;
	}

	public SimulateurEpargne() {
		super();
	}

	public int getCapitalinitiale() {
		return capitalinitiale;
	}

	public void setCapitalinitiale(int capitalinitiale) {
		this.capitalinitiale = capitalinitiale;
	}

	public int getVersement() {
		return versement;
	}

	public void setVersement(int versement) {
		this.versement = versement;
	}

	public int getRendementespere() {
		return rendementespere;
	}

	public void setRendementespere(int rendementespere) {
		this.rendementespere = rendementespere;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	
	
}
