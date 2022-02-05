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
import tn.esprit.spring.domain.Formation;
import tn.esprit.spring.service.CongesService;
import tn.esprit.spring.service.FormationService;
import tn.esprit.spring.service.UserService;

@RestController
@RequestMapping(path = { "/", "/formation"})
public class FormationResource {

	@Autowired
	FormationService fService ;
	
	@Autowired
	UserService uService ;
	
	@GetMapping("/retrieve-all-Formations")
	@ResponseBody
	public List<Formation> getFormations() {
		List<Formation> list = fService.retrieveAllFormations();
		return list;
	}

	@GetMapping("/retrieve-Formation/{f-id}")
	@ResponseBody
	public Formation retrieveFormation(@PathVariable("f-id") String id_f) {
		return fService.retrieveFormation(id_f);
	}

	@PostMapping("/add-Formation")
	@ResponseBody
	public Formation addFormation(@RequestBody Formation f) {
		Formation form = fService.addFormation(f);
		return form;
	}

	@DeleteMapping("/remove-Formation/{f-id}")
	@ResponseBody
	public void removeFormation(@PathVariable("f-id") Long id_f) {
		fService.deleteFormation(id_f);;
	}

	@PutMapping("/modify-Formation")
	@ResponseBody
	public Formation modifyFormation(@RequestBody Formation f) {
		return fService.updateFormation(f);
	}
}
