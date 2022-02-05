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

import tn.esprit.spring.domain.Credit_card;
import tn.esprit.spring.domain.Obligation;
import tn.esprit.spring.service.CreditCardService;
import tn.esprit.spring.service.ObligationService;

@RestController
@RequestMapping(path = { "/", "/credit_card"})
public class CreditCardResource {

	@Autowired
	CreditCardService cService ;
	
	@GetMapping("/retrieve-all-Credit_card")
	@ResponseBody
	public List<Credit_card> getCredit_cards() {
		List<Credit_card> list = cService.retrieveAllCredit_cards();
		return list;
	}

	@GetMapping("/retrieve-Credit_card/{c-id}")
	@ResponseBody
	public Credit_card retrieveCredit_card(@PathVariable("c-id") String id_c) {
		return cService.retrieveCredit_card(id_c);
	}

	@PostMapping("/add-Credit_card")
	@ResponseBody
	public Credit_card addCredit_card(@RequestBody Credit_card c) {
		Credit_card crd = cService.addCredit_card(c);
		return crd;
	}

	@DeleteMapping("/remove-Credit_card/{c-id}")
	@ResponseBody
	public void removeCredit_card(@PathVariable("c-id") Long id_c) {
		cService.deleteCredit_card(id_c);
	}

	@PutMapping("/modify-Credit_card")
	@ResponseBody
	public Credit_card modifyCredit_card(@RequestBody Credit_card c) {
		return cService.updateCredit_card(c);
	}
}
