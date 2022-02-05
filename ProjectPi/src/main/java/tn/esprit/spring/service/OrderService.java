package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Ordre;
import tn.esprit.spring.domain.Salaire;

public interface OrderService {
	
	List<Ordre> retrieveAllOrders();

	Ordre addOrder(Ordre o);

	void deleteOrder(Long id_o);

	Ordre updateOrder(Ordre o);

	Ordre retrieveOrder(String id_o);

}
