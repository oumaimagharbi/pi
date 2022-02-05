package tn.esprit.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

import tn.esprit.spring.domain.Reclamation_assurance;
import tn.esprit.spring.domain.Transaction;
import tn.esprit.spring.domain.util.Aml_p;
import tn.esprit.spring.domain.util.Assurance_p;
import tn.esprit.spring.domain.util.Crd_prediction;

@RestController
@RequestMapping(path = { "/", "/prediction"})
public class PredictionResource {
	
	 @Autowired
	  RestTemplate restTemplate;
	 
	 
	@RequestMapping(value = "/template/crd_p", method = RequestMethod.POST)
	   public String createcrd(@RequestBody List<Crd_prediction> p) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity< List<Crd_prediction>> entity = new HttpEntity<List<Crd_prediction>>(p,headers);
	      
	      return restTemplate.exchange(
	         "http://127.0.0.1:12345/crd", HttpMethod.POST, entity, String.class).getBody();
	   }
	
	@RequestMapping(value = "/template/assurance_p", method = RequestMethod.POST)
	   public String createassurance(@RequestBody List<Reclamation_assurance> p) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity< List<Reclamation_assurance>> entity = new HttpEntity<List<Reclamation_assurance>>(p,headers);
	      
	      return restTemplate.exchange(
	         "http://127.0.0.1:12345/assurance", HttpMethod.POST, entity, String.class).getBody();
	   }
	
	
	@RequestMapping(value = "/template/aml_p", method = RequestMethod.POST)
	   public String createaml(@RequestBody List<Transaction> p) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity< List<Transaction>> entity = new HttpEntity<List<Transaction>>(p,headers);
	      
	      return restTemplate.exchange(
	         "http://127.0.0.1:12345/aml", HttpMethod.POST, entity, String.class).getBody();
	   }


}
