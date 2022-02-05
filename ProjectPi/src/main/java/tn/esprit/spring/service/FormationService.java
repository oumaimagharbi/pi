package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Conges;
import tn.esprit.spring.domain.Formation;

public interface FormationService {

	List<Formation> retrieveAllFormations();

	Formation addFormation(Formation f);

	void deleteFormation(Long id_f);

	Formation updateFormation(Formation f);

	Formation retrieveFormation(String id_f);
}
