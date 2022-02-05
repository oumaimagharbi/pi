package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Action;
import tn.esprit.spring.domain.Compte_titre;

public interface ActionService {

	List<Action> retrieveAllActions();

	Action addAction(Action act);

	void deleteAction(Long id_act);

	Action updateAction(Action act);

	Action retrieveAction(String id_act);
}
