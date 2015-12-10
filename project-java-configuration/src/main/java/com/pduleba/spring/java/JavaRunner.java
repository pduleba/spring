package com.pduleba.spring.java;

import java.text.MessageFormat;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pduleba.spring.java.configuration.SpringConfig;
import com.pduleba.spring.java.configuration.beans.Service;

import lombok.AllArgsConstructor;

public @AllArgsConstructor class JavaRunner {

	private Service service;
	
	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		new JavaRunner(context.getBean(Service.class)).execute();
	}
	
	public void execute() {
		System.out.println("------------------------------------------");
		System.out.println("Starting Java Configuration based Spring...");
		System.out.println("------------------------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.println(MessageFormat.format("Service result :: {0}", service.execute(String.valueOf(i))));
		}
	}
	
}
