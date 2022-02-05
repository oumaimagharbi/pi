package tn.esprit.spring.service;



public interface SimulateurCredit {
	
	public int Remboursementmensuel(int totaleprixacquisition,int dureederemboursement);
	public int FinancementSollicite(int totaleprixacquisition, int apportpropre );
	public int Tauxdendettementmensuel(int dureederemboursement, int revenubrut);
	public int Fraisdetudededossier(int totaleprixacquisition);
	
}
