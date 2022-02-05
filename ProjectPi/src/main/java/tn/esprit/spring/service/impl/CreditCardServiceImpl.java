package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Credit_card;
import tn.esprit.spring.domain.Obligation;
import tn.esprit.spring.repository.CreditCardRepository;
import tn.esprit.spring.repository.ObligationRepository;
import tn.esprit.spring.service.CreditCardService;

@Service
public class CreditCardServiceImpl implements CreditCardService{
	
	@Autowired
	CreditCardRepository crep ;

	@Override
	public List<Credit_card> retrieveAllCredit_cards() {
		// TODO Auto-generated method stub
		return (List<Credit_card>) crep.findAll();
	}

	@Override
	public Credit_card addCredit_card(Credit_card c) {
		// TODO Auto-generated method stub
		return crep.save(c);
	}

	@Override
	public void deleteCredit_card(Long id_c) {
		// TODO Auto-generated method stub
		crep.deleteById((long) id_c);
	}

	@Override
	public Credit_card updateCredit_card(Credit_card c) {
		// TODO Auto-generated method stub
		return crep.save(c);
	}

	@Override
	public Credit_card retrieveCredit_card(String id_c) {
		// TODO Auto-generated method stub
		return crep.findById(Long.parseLong(id_c)).orElse(null);
	}

}
