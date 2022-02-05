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

import tn.esprit.spring.domain.Obligation;
import tn.esprit.spring.domain.Ordre;
import tn.esprit.spring.repository.ObligationRepository;
import tn.esprit.spring.service.ObligationService;
import tn.esprit.spring.service.OrderService;

@RestController
@RequestMapping(path = { "/", "/obligation"})
public class ObligationResource {

	@Autowired
	ObligationService obService ;
	
	@GetMapping("/retrieve-all-Obligation")
	@ResponseBody
	public List<Obligation> getObligations() {
		List<Obligation> list = obService.retrieveAllObligations();
		return list;
	}

	@GetMapping("/retrieve-Obligation/{ob-id}")
	@ResponseBody
	public Obligation retrieveObligation(@PathVariable("ob-id") String id_ob) {
		return obService.retrieveObligation(id_ob);
	}

	@PostMapping("/add-Obligation")
	@ResponseBody
	public Obligation addObligation(@RequestBody Obligation ob) {
		Obligation obl = obService.addObligation(ob);
		return obl;
	}

	@DeleteMapping("/remove-Obligation/{ob-id}")
	@ResponseBody
	public void removeObligation(@PathVariable("ob-id") Long id_ob) {
		obService.deleteObligation(id_ob);
	}

	@PutMapping("/modify-Obligation")
	@ResponseBody
	public Obligation modifyObligation(@RequestBody Obligation ob) {
		return obService.updateObligation(ob);
	}
}
