package com.pduleba.spring.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pduleba.spring.java.configuration.beans.ServiceApi;
import com.pduleba.spring.java.configuration.beans.SpringConfiguration;

import lombok.AllArgsConstructor;

public @AllArgsConstructor class Runner {

	private ServiceApi service;
	
	public static void main(String[] args) {
		final ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Runner runner = new Runner(context.getBean(ServiceApi.SERVICE_BEAN_NAME, ServiceApi.class));
		runner.execute();
	}
	
	public void execute() {
		System.out.println(new StringBuilder("Result :: ").append(service.getResult()).toString());
	}
	
}
