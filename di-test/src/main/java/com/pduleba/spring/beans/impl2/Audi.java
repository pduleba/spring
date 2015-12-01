package com.pduleba.spring.beans.impl2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pduleba.spring.interfaces.Car;

import lombok.Data;

@Component
@Qualifier(value=Audi.BEAN_NAME)
public @Data class Audi implements Car {

	public static final String BEAN_NAME = "carAudi";
	
	private String name;

}
