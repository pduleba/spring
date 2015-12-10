package com.pduleba.spring.java;

import static com.pduleba.spring.java.configuration.beans.Dao.DAO_BEAN_NAME;

import java.text.MessageFormat;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pduleba.spring.java.configuration.SpringConfiguration;
import com.pduleba.spring.java.configuration.beans.Dao;

import lombok.AllArgsConstructor;

public @AllArgsConstructor class JavaRunner {

	private Dao dao;
	
	public static void main(String[] args) throws InterruptedException {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
			new JavaRunner(context.getBean(DAO_BEAN_NAME, Dao.class)).execute();
		}
	}
	
	public void execute() {
		System.out.println("------------------------------------------");
		System.out.println("Starting Java Configuration based Spring...");
		System.out.println("------------------------------------------");
		System.out.println(MessageFormat.format("Execute result :: {0}", dao));
	}
	
}
