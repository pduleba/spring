package com.pduleba.spring.beans.impl1;

import org.springframework.stereotype.Component;

import com.pduleba.spring.interfaces.Car;

import lombok.Data;

@Component(value=Fiat.BEAN_NAME)
public @Data class Fiat implements Car {

	public static final String BEAN_NAME = "carFiat";
	
	private String name;

}
