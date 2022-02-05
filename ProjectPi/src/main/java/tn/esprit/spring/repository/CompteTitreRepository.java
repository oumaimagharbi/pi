package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Compte_titre;

public interface CompteTitreRepository extends JpaRepository<Compte_titre, Long>{

}
