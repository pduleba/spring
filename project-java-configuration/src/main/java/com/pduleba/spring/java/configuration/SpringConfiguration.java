package com.pduleba.spring.java.configuration;

import static com.pduleba.spring.java.configuration.beans.Dao.DAO_BEAN_NAME;
import static com.pduleba.spring.java.configuration.beans.Service.SERVICE_BEAN_NAME;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pduleba.spring.java.configuration.beans.Dao;
import com.pduleba.spring.java.configuration.beans.DaoImpl;
import com.pduleba.spring.java.configuration.beans.Service;
import com.pduleba.spring.java.configuration.beans.ServiceImpl;

@Configuration
public class SpringConfiguration {
	
	@Bean(name=DAO_BEAN_NAME)
	public Dao bean() {
		return new DaoImpl();
	}

	@Bean(name=SERVICE_BEAN_NAME)
	public Service service() {
		return new ServiceImpl();
	}
}
