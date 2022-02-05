package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.domain.ClassState;
import tn.esprit.spring.domain.Compte_titre;

public interface ClassStateRepository extends JpaRepository<ClassState, Long>{

}
