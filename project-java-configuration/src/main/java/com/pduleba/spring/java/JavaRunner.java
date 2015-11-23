package com.pduleba.spring.java;

import static com.pduleba.spring.java.configuration.beans.ServiceApi.SERVICE_BEAN_NAME;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pduleba.spring.java.configuration.beans.LazyLoggerServiceApi;
import com.pduleba.spring.java.configuration.beans.ServiceApi;
import com.pduleba.spring.java.configuration.beans.SpringConfiguration;

import lombok.AllArgsConstructor;

public @AllArgsConstructor class JavaRunner {

	private static ApplicationContext context;
	private ServiceApi service;
	
	public static void main(String[] args) throws InterruptedException {
		context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		new JavaRunner(context.getBean(SERVICE_BEAN_NAME, ServiceApi.class)).execute();
	}
	
	public void execute() {
		System.out.println("Starting Java Configuration based Spring...");
		context.getBean(LazyLoggerServiceApi.class);
		System.out.println(new StringBuilder("Result :: ").append(service.getResult()).toString());
	}
	
}
