package com.pduleba.spring;

public class MultiArgumentBean {

	private Base a;
	private Base b;

	public MultiArgumentBean(Base a, Base b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "MultiArgumentBean [a=" + a + ", b=" + b + "]";
	}
	
}
