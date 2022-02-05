package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.domain.Ordre;
import tn.esprit.spring.domain.Reclamation_assurance;
import tn.esprit.spring.repository.OrderRepository;
import tn.esprit.spring.repository.ReclamationAssuranceRepository;
import tn.esprit.spring.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orep ;

	@Override
	public List<Ordre> retrieveAllOrders() {
		// TODO Auto-generated method stub
		return (List<Ordre>) orep.findAll();
	}

	@Override
	public Ordre addOrder(Ordre o) {
		// TODO Auto-generated method stub
		return orep.save(o);
	}

	@Override
	public void deleteOrder(Long id_o) {
		// TODO Auto-generated method stub
		orep.deleteById((long) id_o);
	}

	@Override
	public Ordre updateOrder(Ordre o) {
		// TODO Auto-generated method stub
		return orep.save(o);
	}

	@Override
	public Ordre retrieveOrder(String id_o) {
		// TODO Auto-generated method stub
		return orep.findById(Long.parseLong(id_o)).orElse(null);
	}

}
