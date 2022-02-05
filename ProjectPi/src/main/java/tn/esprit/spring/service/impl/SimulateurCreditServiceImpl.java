package tn.esprit.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.util.SimulateurCredit;



@Service
public class SimulateurCreditServiceImpl implements tn.esprit.spring.service.SimulateurCredit{

	
	
	@Override
	public int Remboursementmensuel(int totaleprixacquisition,int dureederemboursement) {
		// TODO Auto-generated method stub
		int rm = (totaleprixacquisition+(12/100)*totaleprixacquisition)/dureederemboursement;
		return rm;
	}

	@Override
	public int FinancementSollicite(int totaleprixacquisition, int apportpropre) {
		// TODO Auto-generated method stub
		int fs = totaleprixacquisition-apportpropre ;
		return fs;
	}

	@Override
	public int Tauxdendettementmensuel(int dureederemboursement, int revenubrut) {
		// TODO Auto-generated method stub
		int taux = dureederemboursement/revenubrut ;
		return taux;
	}

	@Override
	public int Fraisdetudededossier(int totaleprixacquisition) {
		// TODO Auto-generated method stub
		int fe = totaleprixacquisition*2/100 ;
		return fe;
	}

	

	

}
