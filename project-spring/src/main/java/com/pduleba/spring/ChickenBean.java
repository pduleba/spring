package com.pduleba.spring;

import lombok.Data;

@Data
public class ChickenBean {

	private String name;
	private ChickenBean parent;

	public ChickenBean(String name) {
		super();
		this.name = name;
	}

	public ChickenBean(String name, ChickenBean parent) {
		super();
		this.name = name;
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "ChickenBean [name=" + name + "]";
	}

}
