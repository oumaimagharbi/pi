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

import tn.esprit.spring.domain.Account;
import tn.esprit.spring.domain.Action;
import tn.esprit.spring.service.AccountService;
import tn.esprit.spring.service.ActionService;

@RestController
@RequestMapping(path = { "/", "/account"})
public class AccountResource {

	@Autowired
	AccountService accService ;
	
	@GetMapping("/retrieve-all-Account")
	@ResponseBody
	public List<Account> getAccounts() {
		List<Account> list = accService.retrieveAllAccounts();
		return list;
	}

	@GetMapping("/retrieve-Account/{acc-id}")
	@ResponseBody
	public Account retrieveAccount(@PathVariable("acc-id") String id_acc) {
		return accService.retrieveAccount(id_acc);
	}

	@PostMapping("/add-Account")
	@ResponseBody
	public Account addAccount(@RequestBody Account acc) {
		Account ac = accService.addAccount(acc);
		return ac;
	}

	@DeleteMapping("/remove-Account/{acc-id}")
	@ResponseBody
	public void removeAccount(@PathVariable("acc-id") Long id_acc) {
		accService.deleteAccount(id_acc);
	}

	@PutMapping("/modify-Account")
	@ResponseBody
	public Account modifyAccount(@RequestBody Account acc) {
		return accService.updateAccount(acc);
	}
}
