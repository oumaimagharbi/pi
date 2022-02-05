package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Conges;
import tn.esprit.spring.domain.Formation;
import tn.esprit.spring.repository.CongesRepository;
import tn.esprit.spring.repository.FormationRepository;
import tn.esprit.spring.repository.UserRepository;
import tn.esprit.spring.service.FormationService;

@Service
public class ForamtionServiceImpl implements FormationService{

	@Autowired
	FormationRepository frep ;
	
	@Autowired
	UserRepository urep ;
	
	@Override
	public List<Formation> retrieveAllFormations() {
		// TODO Auto-generated method stub
		return (List<Formation>) frep.findAll();
	}

	@Override
	public Formation addFormation(Formation f) {
		// TODO Auto-generated method stub
		return frep.save(f);
	}

	@Override
	public void deleteFormation(Long id_f) {
		// TODO Auto-generated method stub
		frep.deleteById((long) id_f);
	}

	@Override
	public Formation updateFormation(Formation f) {
		// TODO Auto-generated method stub
		return frep.save(f);
	}

	@Override
	public Formation retrieveFormation(String id_f) {
		// TODO Auto-generated method stub
		return frep.findById(Long.parseLong(id_f)).orElse(null);
	}

}
