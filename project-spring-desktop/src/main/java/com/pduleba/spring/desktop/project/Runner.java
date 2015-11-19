package com.pduleba.spring.desktop.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pduleba.spring.desktop.project.beans.ServiceApi;

import lombok.AllArgsConstructor;

public @AllArgsConstructor class Runner {

	private static final String CONFIG_LOCATION = "applicationContext.xml";
	private static final String SERVICE_BEAN_NAME = "service";

	private ServiceApi service;
	
	public static void main(String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
		
		Runner runner = new Runner(context.getBean(SERVICE_BEAN_NAME, ServiceApi.class));
		runner.execute();
	}
	
	public void execute() {
		System.out.println(new StringBuilder("Result :: ").append(service.getResult()).toString());
	}
	
}
