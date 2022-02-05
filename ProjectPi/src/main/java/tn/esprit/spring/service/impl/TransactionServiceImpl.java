package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Salaire;
import tn.esprit.spring.domain.Transaction;
import tn.esprit.spring.repository.TransactionRepository;
import tn.esprit.spring.service.TransacationService;

@Service
public class TransactionServiceImpl implements TransacationService{
	
	@Autowired
	TransactionRepository trepo ;

	@Override
	public List<Transaction> retrieveAllTransactions() {
		// TODO Auto-generated method stub
		return (List<Transaction>) trepo.findAll();
	}

	@Override
	public Transaction addTransaction(Transaction t) {
		// TODO Auto-generated method stub
		//t.setOld_blance_org(t.getAccount().getBalance());
		//t.setNew_balance_org(t.getOld_blance_org()-t.getAmount());
		//t.setOld_balance_dest(t.getAccount().getBalance());
		//t.setNew_balance_dest(t.getAccount().getBalance()+t.getAmount());
		return trepo.save(t);
	}

	@Override
	public void deleteTransaction(Long id_t) {
		// TODO Auto-generated method stub
		trepo.deleteById((long) id_t);
	}

	@Override
	public Transaction updateTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return trepo.save(t);
	}

	@Override
	public Transaction retrieveTransaction(String id_t) {
		// TODO Auto-generated method stub
		return trepo.findById(Long.parseLong(id_t)).orElse(null);
	}

}
