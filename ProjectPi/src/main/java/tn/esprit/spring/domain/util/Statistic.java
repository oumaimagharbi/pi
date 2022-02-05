package tn.esprit.spring.domain.util;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;


public class Statistic implements Serializable{


	private long count;
	
	
	public Statistic() {
		super();
	}

	

	










	public Statistic(long count) {
		super();
		this.count = count;
	
	}








	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
	
	
}
