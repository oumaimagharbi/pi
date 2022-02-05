package tn.esprit.spring.domain.util;

public class Aml_p {

	private int step ;
    private float amount;
    private float oldbalanceOrg;
    private float newbalanceOrig;
    private float oldbalanceDest;
    private float newbalanceDest;
    private int CASH_IN;
    private int CASH_OUT;
    private int DEBIT;
    private int PAYMENT;
    private int TRANSFER;
	public Aml_p(int step, float amount, float oldbalanceOrg, float newbalanceOrig, float oldbalanceDest,
			float newbalanceDest, int cASH_IN, int cASH_OUT, int dEBIT, int pAYMENT, int tRANSFER) {
		super();
		this.step = step;
		this.amount = amount;
		this.oldbalanceOrg = oldbalanceOrg;
		this.newbalanceOrig = newbalanceOrig;
		this.oldbalanceDest = oldbalanceDest;
		this.newbalanceDest = newbalanceDest;
		CASH_IN = cASH_IN;
		CASH_OUT = cASH_OUT;
		DEBIT = dEBIT;
		PAYMENT = pAYMENT;
		TRANSFER = tRANSFER;
	}
	public Aml_p() {
		super();
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getOldbalanceOrg() {
		return oldbalanceOrg;
	}
	public void setOldbalanceOrg(float oldbalanceOrg) {
		this.oldbalanceOrg = oldbalanceOrg;
	}
	public float getNewbalanceOrig() {
		return newbalanceOrig;
	}
	public void setNewbalanceOrig(float newbalanceOrig) {
		this.newbalanceOrig = newbalanceOrig;
	}
	public float getOldbalanceDest() {
		return oldbalanceDest;
	}
	public void setOldbalanceDest(float oldbalanceDest) {
		this.oldbalanceDest = oldbalanceDest;
	}
	public float getNewbalanceDest() {
		return newbalanceDest;
	}
	public void setNewbalanceDest(float newbalanceDest) {
		this.newbalanceDest = newbalanceDest;
	}
	public int getCASH_IN() {
		return CASH_IN;
	}
	public void setCASH_IN(int cASH_IN) {
		CASH_IN = cASH_IN;
	}
	public int getCASH_OUT() {
		return CASH_OUT;
	}
	public void setCASH_OUT(int cASH_OUT) {
		CASH_OUT = cASH_OUT;
	}
	public int getDEBIT() {
		return DEBIT;
	}
	public void setDEBIT(int dEBIT) {
		DEBIT = dEBIT;
	}
	public int getPAYMENT() {
		return PAYMENT;
	}
	public void setPAYMENT(int pAYMENT) {
		PAYMENT = pAYMENT;
	}
	public int getTRANSFER() {
		return TRANSFER;
	}
	public void setTRANSFER(int tRANSFER) {
		TRANSFER = tRANSFER;
	}
    
    
}
