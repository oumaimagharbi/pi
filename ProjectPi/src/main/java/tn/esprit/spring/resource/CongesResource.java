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
import tn.esprit.spring.domain.Message;
import tn.esprit.spring.service.CongesService;
import tn.esprit.spring.service.MessageService;
import tn.esprit.spring.service.UserService;

@RestController
@RequestMapping(path = { "/", "/conges"})
public class CongesResource {

	@Autowired
	CongesService cService ;
	
	@Autowired
	UserService uService ;
	
	@GetMapping("/retrieve-all-conges")
	@ResponseBody
	public List<Conges> getConges() {
		List<Conges> list = cService.retrieveAllConges();
		return list;
	}

	@GetMapping("/retrieve-Conges/{c-id}")
	@ResponseBody
	public Conges retrieveConges(@PathVariable("c-id") String id_c) {
		return cService.retrieveConges(id_c);
	}

	@PostMapping("/add-Conges")
	@ResponseBody
	public Conges addConges(@RequestBody Conges c) {
		Conges con = cService.addConges(c);
		return con;
	}

	@DeleteMapping("/remove-Conges/{c-id}")
	@ResponseBody
	public void removeConges(@PathVariable("c-id") Long id_c) {
		cService.deleteConges(id_c);
	}

	@PutMapping("/modify-Conges")
	@ResponseBody
	public Conges modifyConges(@RequestBody Conges c) {
		return cService.updateConges(c);
	}
	
	@PutMapping("/add-Conges-a-user/{c-id}/{user-id}")
	@ResponseBody
	public void affectCongestoUser(@PathVariable("c-id") int id_c, @PathVariable("user-id") int id) {
		cService.affectCongesUser(id_c, id);
	}
}
