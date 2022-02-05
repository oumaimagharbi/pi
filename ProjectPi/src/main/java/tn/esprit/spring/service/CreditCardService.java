package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Credit_card;

public interface CreditCardService {

	List<Credit_card> retrieveAllCredit_cards();

	Credit_card addCredit_card(Credit_card c);

	void deleteCredit_card(Long id_c);

	Credit_card updateCredit_card(Credit_card c);

	Credit_card retrieveCredit_card(String id_c);
}
