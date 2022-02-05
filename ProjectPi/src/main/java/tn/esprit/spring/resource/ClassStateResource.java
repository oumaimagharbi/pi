package tn.esprit.spring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.domain.ClassState;
import tn.esprit.spring.service.ClassStateService;

@RestController
@RequestMapping(path = { "/", "/classstate"})
public class ClassStateResource {

	@Autowired
	ClassStateService csService ;
	
	@GetMapping("/retrieve-all-classstate")
	@ResponseBody
	public List<ClassState> getClassStates() {
		List<ClassState> list = csService.retrieveAllClassStates();
		return list;
	}
	
	@Scheduled(cron = "0 0 0 * * MON")
	@PostMapping("/add-classstate")
	@ResponseBody
	public ClassState addClassState(@RequestBody ClassState cs) {
		ClassState csl = csService.addClassState(cs);
		return csl;
	}
	
	@PutMapping("/modify-classstate")
	@ResponseBody
	public ClassState modifyClassState(@RequestBody ClassState cs) {
		return csService.updateClassState(cs);
	}
}
