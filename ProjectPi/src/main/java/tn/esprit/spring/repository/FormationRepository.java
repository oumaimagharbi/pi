package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.domain.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long>{

}
