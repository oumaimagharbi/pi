package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Obligation;

public interface ObligationService {

	List<Obligation> retrieveAllObligations();

	Obligation addObligation(Obligation ob);

	void deleteObligation(Long id_ob);

	Obligation updateObligation(Obligation ob);

	Obligation retrieveObligation(String id_ob);
}
