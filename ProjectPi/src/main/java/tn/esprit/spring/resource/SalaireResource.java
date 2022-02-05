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

import tn.esprit.spring.domain.Conges;
import tn.esprit.spring.domain.Salaire;
import tn.esprit.spring.service.CongesService;
import tn.esprit.spring.service.SalaireService;
import tn.esprit.spring.service.UserService;

@RestController
@RequestMapping(path = { "/", "/salaire"})
public class SalaireResource {

	@Autowired
	SalaireService sService ;
	
	@Autowired
	UserService uService ;
	
	@GetMapping("/retrieve-all-salaire")
	@ResponseBody
	public List<Salaire> getSalaires() {
		List<Salaire> list = sService.retrieveAllSalaires();
		return list;
	}

	@GetMapping("/retrieve-Salaire/{s-id}")
	@ResponseBody
	public Salaire retrieveSalaire(@PathVariable("s-id") String id_s) {
		return sService.retrieveSalaire(id_s);
	}

	@PostMapping("/add-Salaire")
	@ResponseBody
	public Salaire addSalaire(@RequestBody Salaire s) {
		Salaire sal = sService.addSalaire(s);
		return sal;
	}

	@DeleteMapping("/remove-Salaire/{s-id}")
	@ResponseBody
	public void removeSalaire(@PathVariable("s-id") Long id_s) {
		sService.deleteSalaire(id_s);
	}

	@PutMapping("/modify-Salaire")
	@ResponseBody
	public Salaire modifySalaire(@RequestBody Salaire s) {
		return sService.updateSalaire(s);
	}
	
	@PutMapping("/add-Salaire-a-user/{s-id}/{user-id}")
	@ResponseBody
	public void affectSalairetoUser(@PathVariable("s-id") int id_s, @PathVariable("user-id") int id) {
		sService.affectSalaireUser(id_s, id);
	}
}
