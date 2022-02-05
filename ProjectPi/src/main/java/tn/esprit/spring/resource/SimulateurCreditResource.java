package tn.esprit.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.domain.Formation;
import tn.esprit.spring.domain.Message;
import tn.esprit.spring.service.SimulateurCredit;



@RestController
@RequestMapping(path = { "/", "/simuateurcredit"})
public class SimulateurCreditResource {
	
	@Autowired
	SimulateurCredit simulateurservice;
	
	@GetMapping("/Remboursementmensuel/{totaleprixacquisition}/{dureederemboursement}")
	@ResponseBody
	public int Remboursementmensuel(@PathVariable("totaleprixacquisition") int totaleprixacquisition,@PathVariable("dureederemboursement") int dureederemboursement) {
		return simulateurservice.Remboursementmensuel(totaleprixacquisition, dureederemboursement) ;
	}
	
	@GetMapping("/FinancementSollicite/{totaleprixacquisition}/{apportpropre}")
	@ResponseBody
	public int FinancementSollicite(@PathVariable("totaleprixacquisition") int totaleprixacquisition,@PathVariable("apportpropre") int apportpropre) {
		return simulateurservice.FinancementSollicite(totaleprixacquisition, apportpropre);
	}
	
	@GetMapping("/Tauxdendettementmensuel/{dureederemboursement}/{revenubrut}")
	@ResponseBody
	public int Tauxdendettementmensuel(@PathVariable("dureederemboursement") int dureederemboursement,@PathVariable("revenubrut") int revenubrut) {
		return simulateurservice.Tauxdendettementmensuel(dureederemboursement, revenubrut);
	}
	
	@GetMapping("/Fraisdetudededossier/{totaleprixacquisition}")
	@ResponseBody
	public int Fraisdetudededossier(@PathVariable("totaleprixacquisition") int totaleprixacquisition) {
		return simulateurservice.Fraisdetudededossier(totaleprixacquisition);
	}

	
	

}
