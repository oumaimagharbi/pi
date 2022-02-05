package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Credit_card;

public interface CreditCardRepository extends JpaRepository<Credit_card, Long>{

}
