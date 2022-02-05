package tn.esprit.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.service.SimulateurCredit;
import tn.esprit.spring.service.SimulateurEpargne;

@RestController
@RequestMapping(path = { "/", "/simuateurepargne"})
public class SimuateurEpargneResource {

	@Autowired
	SimulateurEpargne simulateurservice;
	
	@GetMapping("/Capitalfinal/{capitalinitiale}/{versement}/{duree}")
	@ResponseBody
	public int Capitalfinal(@PathVariable("capitalinitiale") int capitalinitiale,@PathVariable("versement") int versement,@PathVariable("duree") int duree) {
		return simulateurservice.Capitalfinal(capitalinitiale, versement, duree);
	}
}
