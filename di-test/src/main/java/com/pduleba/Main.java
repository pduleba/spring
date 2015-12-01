package com.pduleba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.pduleba.spring.beans.CarSalonImpl;

public class Main {

	public static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	private CarSalonImpl carSalon;
	
	public Main(CarSalonImpl carSalon) {
		super();
		Assert.notNull(carSalon);
		this.carSalon = carSalon;
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		new Main(context.getBean(CarSalonImpl.class)).doAction();
	}
	
	private void doAction() {
		LOG.info("car -> " + carSalon.getCar());;
	}
}
