package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Action;
import tn.esprit.spring.domain.ClassState;
import tn.esprit.spring.repository.ClassStateRepository;
import tn.esprit.spring.service.ClassStateService;

@Service
public class ClassStateServiceImpl implements ClassStateService{

	@Autowired
	ClassStateRepository crep ;
	
	@Override
	public List<ClassState> retrieveAllClassStates() {
		// TODO Auto-generated method stub
		return (List<ClassState>) crep.findAll();
	}

	@Override
	public ClassState addClassState(ClassState cs) {
		// TODO Auto-generated method stub
		return crep.save(cs);
	}

	@Override
	public ClassState updateClassState(ClassState cs) {
		// TODO Auto-generated method stub
		return crep.save(cs);
	}

}
