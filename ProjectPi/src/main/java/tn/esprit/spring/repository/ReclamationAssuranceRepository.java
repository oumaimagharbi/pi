package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Reclamation_assurance;

public interface ReclamationAssuranceRepository extends JpaRepository<Reclamation_assurance, Long>{

}
