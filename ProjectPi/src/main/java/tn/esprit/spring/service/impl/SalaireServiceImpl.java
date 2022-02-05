package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Conges;
import tn.esprit.spring.domain.Salaire;
import tn.esprit.spring.domain.User;
import tn.esprit.spring.repository.CongesRepository;
import tn.esprit.spring.repository.SalaireRepository;
import tn.esprit.spring.repository.UserRepository;
import tn.esprit.spring.service.SalaireService;

@Service
public class SalaireServiceImpl implements SalaireService{
	
	@Autowired
	SalaireRepository srep ;
	
	@Autowired
	UserRepository urep ;

	@Override
	public List<Salaire> retrieveAllSalaires() {
		// TODO Auto-generated method stub
		return (List<Salaire>) srep.findAll();
	}

	@Override
	public Salaire addSalaire(Salaire s) {
		// TODO Auto-generated method stub
		return srep.save(s);
	}

	@Override
	public void deleteSalaire(Long id_s) {
		// TODO Auto-generated method stub
		srep.deleteById((long) id_s);
	}

	@Override
	public Salaire updateSalaire(Salaire s) {
		// TODO Auto-generated method stub
		return srep.save(s);
	}

	@Override
	public Salaire retrieveSalaire(String id_s) {
		// TODO Auto-generated method stub
		return srep.findById(Long.parseLong(id_s)).orElse(null);
	}

	@Override
	public void affectSalaireUser(long id_s, long id) {
		// TODO Auto-generated method stub
		Salaire salaire = srep.findById((long) id_s).orElse(null);
		User user = urep.findById((long) id).orElse(null);
		user.setSalaire(salaire);
		urep.save(user);
	}

}
