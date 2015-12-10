package com.pduleba.spring.java;

import java.text.MessageFormat;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pduleba.spring.java.configuration.SpringConfig;
import com.pduleba.spring.java.configuration.beans.Service;

import lombok.AllArgsConstructor;

public @AllArgsConstructor class Main {

	private Service serviceA;
	private Service serviceB;
	
	public static void main(String[] args) throws InterruptedException {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
			Service serviceABean = context.getBean(Service.SERVICE_A_BEAN_NAME, Service.class);
			Service serviceBBean = context.getBean(Service.SERVICE_B_BEAN_NAME, Service.class);
			new Main(serviceABean, serviceBBean).execute();
		}
	}
	
	public void execute() {
		System.out.println("------------------------------------------");
		System.out.println("Starting Java Configuration based Spring...");
		System.out.println("------------------------------------------");

		System.out.println(MessageFormat.format("Service A result :: {0}", serviceA.execute()));
		System.out.println(MessageFormat.format("Service B result :: {0}", serviceB.execute()));
	}
	
}
