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
import tn.esprit.spring.domain.Salaire;
import tn.esprit.spring.domain.Transaction;
import tn.esprit.spring.service.SalaireService;
import tn.esprit.spring.service.TransacationService;
import tn.esprit.spring.service.UserService;

@RestController
@RequestMapping(path = { "/", "/transaction"})
public class TransactionResource {

	@Autowired
	TransacationService tService ;
	
	@Autowired
	UserService uService ;
	
	@GetMapping("/retrieve-all-Transacation")
	@ResponseBody
	public List<Transaction> getTransacations() {
		List<Transaction> list = tService.retrieveAllTransactions();
		return list;
	}

	@GetMapping("/retrieve-Transaction/{t-id}")
	@ResponseBody
	public Transaction retrieveTransaction(@PathVariable("t-id") String id_t) {
		return tService.retrieveTransaction(id_t);
	}

	@PostMapping("/add-Transaction")
	@ResponseBody
	public Transaction addTransaction(@RequestBody Transaction t) {
		Transaction tran = tService.addTransaction(t);
		return tran;
	}

	@DeleteMapping("/remove-Transaction/{t-id}")
	@ResponseBody
	public void removeTransaction(@PathVariable("t-id") Long id_t) {
		tService.deleteTransaction(id_t);
	}

	@PutMapping("/modify-Transaction")
	@ResponseBody
	public Transaction modifyTransaction(@RequestBody Transaction t) {
		return tService.updateTransaction(t);
	}
}
