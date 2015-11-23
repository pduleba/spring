package com.pduleba.spring.java.configuration.beans;

import static com.pduleba.spring.java.configuration.beans.ServiceApi.SERVICE_BEAN_NAME;
import static com.pduleba.spring.java.configuration.beans.TimeServiceApi.TIME_SERVICE_BEAN_NAME;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	private static String SERVICE_BEAN_MESSAGE = "Hello";

	@Bean(name=SERVICE_BEAN_NAME, autowire=Autowire.BY_TYPE)
	public ServiceImpl service() {
		return new ServiceImpl(SERVICE_BEAN_MESSAGE);
	}
	
	@Bean(name=TIME_SERVICE_BEAN_NAME)
	public TimeServiceImpl timeService() {
		return new TimeServiceImpl();
	}
}
