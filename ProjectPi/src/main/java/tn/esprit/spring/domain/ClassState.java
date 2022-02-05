package tn.esprit.spring.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassState implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private float val1 ;
	
	private float val2 ;
	
	private float val3 ;
	
	private float val4 ;

	

	public ClassState(long id, float val1, float val2, float val3, float val4) {
		super();
		this.id = id;
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		this.val4 = val4;
	}

	public ClassState() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getVal1() {
		return val1;
	}

	public void setVal1(float val1) {
		this.val1 = val1;
	}

	public float getVal2() {
		return val2;
	}

	public void setVal2(float val2) {
		this.val2 = val2;
	}

	public float getVal3() {
		return val3;
	}

	public void setVal3(float val3) {
		this.val3 = val3;
	}

	public float getVal4() {
		return val4;
	}

	public void setVal4(float val4) {
		this.val4 = val4;
	}
	
	
	

}
