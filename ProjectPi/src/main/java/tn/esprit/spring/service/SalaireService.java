package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Salaire;

public interface SalaireService {

	List<Salaire> retrieveAllSalaires();

	Salaire addSalaire(Salaire s);

	void deleteSalaire(Long id_s);

	Salaire updateSalaire(Salaire s);

	Salaire retrieveSalaire(String id_s);
	
	public void affectSalaireUser(long id_s, long id);
}
