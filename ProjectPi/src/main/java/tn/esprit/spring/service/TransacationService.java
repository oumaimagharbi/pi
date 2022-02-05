package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Salaire;
import tn.esprit.spring.domain.Transaction;

public interface TransacationService {

	List<Transaction> retrieveAllTransactions();

	Transaction addTransaction(Transaction t);

	void deleteTransaction(Long id_t);

	Transaction updateTransaction(Transaction t);

	Transaction retrieveTransaction(String id_t);
	
}
