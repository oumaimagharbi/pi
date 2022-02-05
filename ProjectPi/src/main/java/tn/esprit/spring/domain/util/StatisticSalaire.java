package tn.esprit.spring.domain.util;

import java.math.BigDecimal;

public class StatisticSalaire {
	private long sum;

	public StatisticSalaire(long sum) {
		super();
		this.sum = sum;
	}

	public StatisticSalaire() {
		super();
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	

}
