package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Conges;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
