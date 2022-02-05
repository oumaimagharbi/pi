package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Obligation;
import tn.esprit.spring.repository.ObligationRepository;
import tn.esprit.spring.repository.OrderRepository;
import tn.esprit.spring.service.ObligationService;

@Service
public class ObligationServiceImpl implements ObligationService{
	
	@Autowired
	ObligationRepository obrep ;

	@Override
	public List<Obligation> retrieveAllObligations() {
		// TODO Auto-generated method stub
		return (List<Obligation>) obrep.findAll();
	}

	@Override
	public Obligation addObligation(Obligation ob) {
		// TODO Auto-generated method stub
		return obrep.save(ob);
	}

	@Override
	public void deleteObligation(Long id_ob) {
		// TODO Auto-generated method stub
		obrep.deleteById((long) id_ob);
	}

	@Override
	public Obligation updateObligation(Obligation ob) {
		// TODO Auto-generated method stub
		return obrep.save(ob);
	}

	@Override
	public Obligation retrieveObligation(String id_ob) {
		// TODO Auto-generated method stub
		return obrep.findById(Long.parseLong(id_ob)).orElse(null);
	}

}
