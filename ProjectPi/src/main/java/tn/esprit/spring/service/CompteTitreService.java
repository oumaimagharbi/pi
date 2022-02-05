package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Compte_titre;
import tn.esprit.spring.domain.Credit_card;

public interface CompteTitreService {

	List<Compte_titre> retrieveAllCompte_titres();

	Compte_titre addCompte_titre(Compte_titre c);

	void deleteCompte_titre(Long id_comp);

	Compte_titre updateCompte_titre(Compte_titre c);

	Compte_titre retrieveCompte_titre(String id_comp);
}
