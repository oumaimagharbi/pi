package tn.esprit.spring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.domain.Ordre;
import tn.esprit.spring.domain.Reclamation_assurance;
import tn.esprit.spring.repository.OrderRepository;
import tn.esprit.spring.service.OrderService;
import tn.esprit.spring.service.ReclamationAssuranceService;

@RestController
@RequestMapping(path = { "/", "/ordre"})
public class OrdreResource {

	@Autowired
	OrderService oService ;
	
	@GetMapping("/retrieve-all-Order")
	@ResponseBody
	public List<Ordre> getOrdres() {
		List<Ordre> list = oService.retrieveAllOrders();
		return list;
	}

	@GetMapping("/retrieve-Order/{o-id}")
	@ResponseBody
	public Ordre retrieveOrder(@PathVariable("o-id") String id_o) {
		return oService.retrieveOrder(id_o);
	}

	@PostMapping("/add-Order")
	@ResponseBody
	public Ordre addOrder(@RequestBody Ordre o) {
		Ordre ord = oService.addOrder(o);
		return ord;
	}

	@DeleteMapping("/remove-Order/{o-id}")
	@ResponseBody
	public void removeOrder(@PathVariable("o-id") Long id_o) {
		oService.deleteOrder(id_o);;
	}

	@PutMapping("/modify-Order")
	@ResponseBody
	public Ordre modifyOrder(@RequestBody Ordre o) {
		return oService.updateOrder(o);
	}
}
