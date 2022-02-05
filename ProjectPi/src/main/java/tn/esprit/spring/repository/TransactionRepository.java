package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Formation;
import tn.esprit.spring.domain.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	@Query("SELECT t FROM Transaction t WHERE t.account= :account")
	List<Transaction> SearchTransactionbyAccount(@Param("account") Account account);

}
