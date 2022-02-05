package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Account;

public interface AccountService {

	List<Account> retrieveAllAccounts();

	Account addAccount(Account acc);

	void deleteAccount(Long referance);

	Account updateAccount(Account acc);

	Account retrieveAccount(String referance);
}
