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

import tn.esprit.spring.domain.Reclamation_assurance;
import tn.esprit.spring.domain.Salaire;
import tn.esprit.spring.service.ReclamationAssuranceService;
import tn.esprit.spring.service.SalaireService;

@RestController
@RequestMapping(path = { "/", "/reclamationassurance"})
public class ReclamationAssuranceResource {

	@Autowired
	ReclamationAssuranceService rService ;
	
	@GetMapping("/retrieve-all-ReclamationAssurance")
	@ResponseBody
	public List<Reclamation_assurance> getReclamation_assurances() {
		List<Reclamation_assurance> list = rService.retrieveAllReclamation_assurances();
		return list;
	}

	@GetMapping("/retrieve-Reclamation_assurance/{r-id}")
	@ResponseBody
	public Reclamation_assurance retrieveReclamation_assurance(@PathVariable("r-id") String id_r) {
		return rService.retrieveReclamation_assurance(id_r);
	}

	@PostMapping("/add-Reclamation_assurance")
	@ResponseBody
	public Reclamation_assurance addReclamation_assurance(@RequestBody Reclamation_assurance r) {
		Reclamation_assurance rec = rService.addReclamation_assurance(r);
		return rec;
	}

	@DeleteMapping("/remove-Reclamation_assurance/{r-id}")
	@ResponseBody
	public void removeReclamation_assurance(@PathVariable("r-id") Long id_r) {
		rService.deleteReclamation_assurance(id_r);
	}

	@PutMapping("/modify-Reclamation_assurance")
	@ResponseBody
	public Reclamation_assurance modifyReclamation_assurance(@RequestBody Reclamation_assurance r) {
		return rService.updateReclamation_assurance(r);
	}
}
