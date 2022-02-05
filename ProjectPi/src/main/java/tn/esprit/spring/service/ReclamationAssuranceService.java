package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Reclamation_assurance;
import tn.esprit.spring.domain.Salaire;

public interface ReclamationAssuranceService {
	
	List<Reclamation_assurance> retrieveAllReclamation_assurances();

	Reclamation_assurance addReclamation_assurance(Reclamation_assurance r);

	void deleteReclamation_assurance(Long id_r);

	Reclamation_assurance updateReclamation_assurance(Reclamation_assurance r);

	Reclamation_assurance retrieveReclamation_assurance(String id_r);

}
