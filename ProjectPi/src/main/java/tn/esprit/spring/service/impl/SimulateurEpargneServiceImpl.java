package tn.esprit.spring.service.impl;

import org.springframework.stereotype.Service;

import tn.esprit.spring.service.SimulateurEpargne;

@Service
public class SimulateurEpargneServiceImpl implements SimulateurEpargne{

	@Override
	public int Capitalfinal(int capitalinitiale, int versement, int duree) {
		// TODO Auto-generated method stub
		int cf = (capitalinitiale+versement*duree)*(12/100);
		return cf;
	}

}
