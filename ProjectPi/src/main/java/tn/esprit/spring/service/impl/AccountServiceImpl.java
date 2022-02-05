package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Action;
import tn.esprit.spring.repository.AccountRepository;
import tn.esprit.spring.repository.ActionRepository;
import tn.esprit.spring.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepository accrep ;

	@Override
	public List<Account> retrieveAllAccounts() {
		// TODO Auto-generated method stub
		return (List<Account>) accrep.findAll();
	}

	@Override
	public Account addAccount(Account acc) {
		// TODO Auto-generated method stub
		return accrep.save(acc);
	}

	@Override
	public void deleteAccount(Long referance) {
		// TODO Auto-generated method stub
		accrep.deleteById((long) referance);
	}

	@Override
	public Account updateAccount(Account acc) {
		// TODO Auto-generated method stub
		return accrep.save(acc);
	}

	@Override
	public Account retrieveAccount(String referance) {
		// TODO Auto-generated method stub
		return accrep.findById(Long.parseLong(referance)).orElse(null);
	}

}
