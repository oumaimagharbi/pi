package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Conges;

public interface CongesService {

	List<Conges> retrieveAllConges();

	Conges addConges(Conges c);

	void deleteConges(Long id_c);

	Conges updateConges(Conges c);

	Conges retrieveConges(String id_c);
	
	public void affectCongesUser(long id_c, long id);
}
