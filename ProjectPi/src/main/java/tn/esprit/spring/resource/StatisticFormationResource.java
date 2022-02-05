package tn.esprit.spring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.domain.Formation;
import tn.esprit.spring.domain.Message;
import tn.esprit.spring.domain.Salaire;
import tn.esprit.spring.domain.User;
import tn.esprit.spring.domain.util.StatMesRep;
import tn.esprit.spring.domain.util.Statistic;
import tn.esprit.spring.domain.util.StatisticCountMsg;
import tn.esprit.spring.domain.util.StatisticSalaire;
import tn.esprit.spring.domain.util.StatisticTempsMsg;
import tn.esprit.spring.domain.util.StatisticUser;
import tn.esprit.spring.service.FormationService;
import tn.esprit.spring.service.MessageService;
import tn.esprit.spring.service.SalaireService;
import tn.esprit.spring.service.UserService;
import tn.esprit.spring.service.impl.ServiceStatisticImpl;

@RestController
@RequestMapping(path = { "/", "/statsticformation"})
public class StatisticFormationResource {

	@Autowired
	ServiceStatisticImpl statService;
	
	@Autowired
	FormationService fservice ;
	
	@Autowired
	UserService uservice ;
	
	@Autowired
	SalaireService salservice ;
	
	@Autowired
	MessageService msgservice ;
	
	@GetMapping("/statistic")
	@ResponseBody
	public ResponseEntity<Statistic> getStatistic() {
		List<Formation> formations = fservice.retrieveAllFormations();
		Statistic statistics = statService.CreateStatistic(formations);

		return ResponseEntity.ok(statistics);
	}
	
	@GetMapping("/countuser")
	@ResponseBody
	public ResponseEntity<StatisticUser> getcount() {
		List<User> users = uservice.getUsers();
		StatisticUser statistics = statService.CountAgent(users);

		return ResponseEntity.ok(statistics);
	}
	
	@GetMapping("/countsalaire")
	@ResponseBody
	public ResponseEntity<StatisticSalaire> getsumsalaire() {
		List<Salaire> salaires = salservice.retrieveAllSalaires();
		StatisticSalaire statistics = statService.SumSalaire(salaires);

		return ResponseEntity.ok(statistics);
	}
	
	@GetMapping("/countmsg")
	@ResponseBody
	public ResponseEntity<StatisticCountMsg> getcountMsg() {
		List<Message> messages = msgservice.retrieveAllMessages();
		StatisticCountMsg statistics = statService.CountMsg(messages);

		return ResponseEntity.ok(statistics);
	}
	
	@GetMapping("/countmsgtemps")
	@ResponseBody
	public ResponseEntity<StatisticTempsMsg> getcountMsgtemps() {
		List<Message> messages = msgservice.retrieveAllMessages();
		StatisticTempsMsg statistics = statService.SumMsgTemps(messages);

		return ResponseEntity.ok(statistics);
	}
	
	@GetMapping("/countmsgtempsrep")
	@ResponseBody
	public ResponseEntity<StatMesRep> getcountMsgtempsRp() {
		List<Message> messages = msgservice.retrieveAllMessages();
		StatMesRep statistics = statService.SumMsgTempsRep(messages);

		return ResponseEntity.ok(statistics);
	}
}
