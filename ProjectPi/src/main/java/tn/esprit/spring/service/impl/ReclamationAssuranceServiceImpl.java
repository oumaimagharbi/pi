package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Formation;
import tn.esprit.spring.domain.Reclamation_assurance;
import tn.esprit.spring.repository.FormationRepository;
import tn.esprit.spring.repository.ReclamationAssuranceRepository;
import tn.esprit.spring.service.ReclamationAssuranceService;

@Service
public class ReclamationAssuranceServiceImpl implements ReclamationAssuranceService{
	
	
	@Autowired
	ReclamationAssuranceRepository rrep ;

	@Override
	public List<Reclamation_assurance> retrieveAllReclamation_assurances() {
		// TODO Auto-generated method stub
		return (List<Reclamation_assurance>) rrep.findAll();
	}

	@Override
	public Reclamation_assurance addReclamation_assurance(Reclamation_assurance r) {
		// TODO Auto-generated method stub
		return rrep.save(r);
	}

	@Override
	public void deleteReclamation_assurance(Long id_r) {
		// TODO Auto-generated method stub
		rrep.deleteById((long) id_r);
	}

	@Override
	public Reclamation_assurance updateReclamation_assurance(Reclamation_assurance r) {
		// TODO Auto-generated method stub
		return rrep.save(r);
	}

	@Override
	public Reclamation_assurance retrieveReclamation_assurance(String id_r) {
		// TODO Auto-generated method stub
		return rrep.findById(Long.parseLong(id_r)).orElse(null);
	}

}
