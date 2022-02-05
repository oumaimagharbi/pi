package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Compte_titre;
import tn.esprit.spring.domain.Credit_card;
import tn.esprit.spring.repository.CompteTitreRepository;
import tn.esprit.spring.repository.CreditCardRepository;
import tn.esprit.spring.service.CompteTitreService;

@Service
public class CompteTitreServiceImpl implements CompteTitreService{
	
	@Autowired
	CompteTitreRepository ctrep ;

	@Override
	public List<Compte_titre> retrieveAllCompte_titres() {
		// TODO Auto-generated method stub
		return (List<Compte_titre>) ctrep.findAll();
	}

	@Override
	public Compte_titre addCompte_titre(Compte_titre c) {
		// TODO Auto-generated method stub
		return ctrep.save(c);
	}

	@Override
	public void deleteCompte_titre(Long id_comp) {
		// TODO Auto-generated method stub
		ctrep.deleteById((long) id_comp);
	}

	@Override
	public Compte_titre updateCompte_titre(Compte_titre c) {
		// TODO Auto-generated method stub
		return ctrep.save(c);
	}

	@Override
	public Compte_titre retrieveCompte_titre(String id_comp) {
		// TODO Auto-generated method stub
		return ctrep.findById(Long.parseLong(id_comp)).orElse(null);
	}

}
