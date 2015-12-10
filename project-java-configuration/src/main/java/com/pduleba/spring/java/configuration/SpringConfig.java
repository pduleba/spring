package com.pduleba.spring.java.configuration;

import static com.pduleba.spring.java.configuration.beans.Service.SERVICE_A_BEAN_NAME;
import static com.pduleba.spring.java.configuration.beans.Service.SERVICE_B_BEAN_NAME;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pduleba.spring.java.configuration.beans.Command;
import com.pduleba.spring.java.configuration.beans.CommandImpl;
import com.pduleba.spring.java.configuration.beans.Service;
import com.pduleba.spring.java.configuration.beans.ServiceImpl;

@Configuration
public class SpringConfig {
	
	@Bean(name=SERVICE_A_BEAN_NAME)
	public Service createServiceA() {
		return new ServiceImpl(createCommad());
	}
	
	@Bean(name=SERVICE_B_BEAN_NAME)
	public Service createServiceB() {
		return new ServiceImpl(createCommad());
	}

	@Bean
	public Command createCommad() {
		return new CommandImpl();
	}
}
