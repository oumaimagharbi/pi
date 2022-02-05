package tn.esprit.spring.domain.util;

public class StatisticTempsMsg {

	private long sum ;

	public StatisticTempsMsg(long sum) {
		super();
		this.sum = sum;
	}

	public StatisticTempsMsg() {
		super();
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	
}
