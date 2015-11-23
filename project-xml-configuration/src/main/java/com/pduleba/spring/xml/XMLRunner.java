package com.pduleba.spring.xml;

import static com.pduleba.spring.xml.configuration.beans.ServiceApi.SERVICE_BEAN_NAME;
import static com.pduleba.spring.xml.inheritance.InheritanceExampleServiceApi.INHERITING_BEAN_NAME;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pduleba.spring.xml.configuration.beans.LazyLoggerServiceApi;
import com.pduleba.spring.xml.configuration.beans.ServiceApi;

import lombok.AllArgsConstructor;

public @AllArgsConstructor class XMLRunner {

	private static final String CONFIG_LOCATION = "applicationContext.xml";

	private static ConfigurableApplicationContext context;
	private ServiceApi service;
	
	public static void main(String[] args) throws InterruptedException {
		context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
		
		new XMLRunner(context.getBean(SERVICE_BEAN_NAME, ServiceApi.class)).execute();
		
		context.registerShutdownHook();
	}
	
	public void execute() {
		System.out.println("------------------------------------------");
		System.out.println("Starting XML Configuration based Spring...");
		System.out.println("------------------------------------------");
		System.out.println(context.getBean(LazyLoggerServiceApi.class));
		System.out.println(context.getBean(INHERITING_BEAN_NAME));
		System.out.println(new StringBuilder("Result :: ").append(service.getResult()).toString());
	}
	
}
