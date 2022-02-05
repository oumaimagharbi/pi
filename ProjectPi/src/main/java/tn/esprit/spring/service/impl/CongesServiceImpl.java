package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Conges;
import tn.esprit.spring.domain.Message;
import tn.esprit.spring.domain.User;
import tn.esprit.spring.repository.CongesRepository;
import tn.esprit.spring.repository.MessageRepository;
import tn.esprit.spring.repository.UserRepository;
import tn.esprit.spring.service.CongesService;

@Service
public class CongesServiceImpl implements CongesService{
	
	@Autowired
	CongesRepository crep ;
	
	@Autowired
	UserRepository urep ;

	@Override
	public List<Conges> retrieveAllConges() {
		// TODO Auto-generated method stub
		return (List<Conges>) crep.findAll();
	}

	@Override
	public Conges addConges(Conges c) {
		// TODO Auto-generated method stub
		return crep.save(c);
	}

	@Override
	public void deleteConges(Long id_c) {
		// TODO Auto-generated method stub
		crep.deleteById((long) id_c);
	}

	@Override
	public Conges updateConges(Conges c) {
		// TODO Auto-generated method stub
		return crep.save(c);
	}

	@Override
	public Conges retrieveConges(String id_c) {
		// TODO Auto-generated method stub
		return crep.findById(Long.parseLong(id_c)).orElse(null);
	}

	@Override
	public void affectCongesUser(long id_c, long id) {
		// TODO Auto-generated method stub
		Conges conges = crep.findById((long) id_c).orElse(null);
		User user = urep.findById((long) id).orElse(null);
		user.setConges(conges);
		urep.save(user);
	}

}
