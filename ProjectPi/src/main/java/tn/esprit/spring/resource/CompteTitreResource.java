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

import tn.esprit.spring.domain.Compte_titre;
import tn.esprit.spring.domain.Credit_card;
import tn.esprit.spring.service.CompteTitreService;
import tn.esprit.spring.service.CreditCardService;

@RestController
@RequestMapping(path = { "/", "/comptetitre"})
public class CompteTitreResource {

	@Autowired
	CompteTitreService cpService ;
	
	@GetMapping("/retrieve-all-Compte_titre")
	@ResponseBody
	public List<Compte_titre> getCompte_titres() {
		List<Compte_titre> list = cpService.retrieveAllCompte_titres();
		return list;
	}

	@GetMapping("/retrieve-Compte_titre/{comp-id}")
	@ResponseBody
	public Compte_titre retrieveCompte_titre(@PathVariable("comp-id") String id_comp) {
		return cpService.retrieveCompte_titre(id_comp);
	}

	@PostMapping("/add-Compte_titre")
	@ResponseBody
	public Compte_titre addCompte_titre(@RequestBody Compte_titre c) {
		Compte_titre comp = cpService.addCompte_titre(c);
		return comp;
	}

	@DeleteMapping("/remove-Compte_titre/{comp-id}")
	@ResponseBody
	public void removeCompte_titre(@PathVariable("comp-id") Long id_comp) {
		cpService.deleteCompte_titre(id_comp);
	}

	@PutMapping("/modify-Compte_titre")
	@ResponseBody
	public Compte_titre modifyCompte_titre(@RequestBody Compte_titre c) {
		return cpService.updateCompte_titre(c);
	}
}
