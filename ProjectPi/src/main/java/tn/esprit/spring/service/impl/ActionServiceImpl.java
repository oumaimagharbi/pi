package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Action;
import tn.esprit.spring.domain.Compte_titre;
import tn.esprit.spring.repository.ActionRepository;
import tn.esprit.spring.repository.CompteTitreRepository;
import tn.esprit.spring.service.ActionService;

@Service
public class ActionServiceImpl implements ActionService{
	
	@Autowired
	ActionRepository actrep ;

	@Override
	public List<Action> retrieveAllActions() {
		// TODO Auto-generated method stub
		return (List<Action>) actrep.findAll();
	}

	@Override
	public Action addAction(Action act) {
		// TODO Auto-generated method stub
		return actrep.save(act);
	}

	@Override
	public void deleteAction(Long id_act) {
		// TODO Auto-generated method stub
		actrep.deleteById((long) id_act);
	}

	@Override
	public Action updateAction(Action act) {
		// TODO Auto-generated method stub
		return actrep.save(act);
	}

	@Override
	public Action retrieveAction(String id_act) {
		// TODO Auto-generated method stub
		return actrep.findById(Long.parseLong(id_act)).orElse(null);
	}

}
