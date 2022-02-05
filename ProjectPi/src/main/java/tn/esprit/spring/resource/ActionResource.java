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

import tn.esprit.spring.domain.Action;
import tn.esprit.spring.domain.Compte_titre;
import tn.esprit.spring.service.ActionService;
import tn.esprit.spring.service.CompteTitreService;

@RestController
@RequestMapping(path = { "/", "/action"})
public class ActionResource {

	@Autowired
	ActionService actService ;
	
	@GetMapping("/retrieve-all-Action")
	@ResponseBody
	public List<Action> getActions() {
		List<Action> list = actService.retrieveAllActions();
		return list;
	}

	@GetMapping("/retrieve-Action/{a-id}")
	@ResponseBody
	public Action retrieveAction(@PathVariable("a-id") String id_a) {
		return actService.retrieveAction(id_a);
	}

	@PostMapping("/add-Action")
	@ResponseBody
	public Action addAction(@RequestBody Action a) {
		Action act = actService.addAction(a);
		return act;
	}

	@DeleteMapping("/remove-Action/{a-id}")
	@ResponseBody
	public void removeAction(@PathVariable("a-id") Long id_a) {
		actService.deleteAction(id_a);
	}

	@PutMapping("/modify-Action")
	@ResponseBody
	public Action modifyAction(@RequestBody Action a) {
		return actService.updateAction(a);
	}
}
