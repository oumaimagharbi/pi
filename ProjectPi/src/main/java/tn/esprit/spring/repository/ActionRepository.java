package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Action;

public interface ActionRepository extends JpaRepository<Action, Long>{

}
