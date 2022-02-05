package tn.esprit.spring.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;

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



@Service
public class ServiceStatisticImpl  {

	
	public Statistic CreateStatistic(List<Formation> formations) {
		// TODO Auto-generated method stub
		Statistic statistics = new Statistic();
		((Statistic) statistics).setCount(formations.stream().count());
		

		return (Statistic) statistics;
	}
	
	public StatisticUser CountAgent(List<User> users) {
		// TODO Auto-generated method stub
		StatisticUser statistics = new StatisticUser();
		((StatisticUser) statistics).setCount(users.stream().count());
		

		return (StatisticUser) statistics;
	}
	
	public StatisticSalaire SumSalaire(List<Salaire> salaires) {
		// TODO Auto-generated method stub
		StatisticSalaire statistics = new StatisticSalaire();
		((StatisticSalaire) statistics).setSum((long) (salaires.stream().mapToDouble(t -> t.getSalaire()).sum()));
		

		return (StatisticSalaire) statistics;
	}
	
	public StatisticCountMsg CountMsg(List<Message> messages) {
		// TODO Auto-generated method stub
		StatisticCountMsg statistics = new StatisticCountMsg();
		((StatisticCountMsg) statistics).setCount(messages.stream().count());
		

		return (StatisticCountMsg) statistics;
	}
	
	public StatisticTempsMsg SumMsgTemps(List<Message> messages) {
		// TODO Auto-generated method stub
		StatisticTempsMsg statistics = new StatisticTempsMsg();

		((StatisticTempsMsg) statistics).setSum((long) (messages.stream().mapToDouble(t -> t.getDate_envoi().getTime()).sum()));
		

		return (StatisticTempsMsg) statistics;
	}
	
	public StatMesRep SumMsgTempsRep(List<Message> messages) {
		// TODO Auto-generated method stub
		StatMesRep statistics = new StatMesRep();

		((StatMesRep) statistics).setSum((long) (messages.stream().mapToDouble(t -> t.getDate_rep().getTime()).sum()));
		

		return (StatMesRep) statistics;
	}

}
