package com.pduleba.spring.java.configuration;

import static com.pduleba.spring.java.configuration.beans.Service.SERVICE_BEAN_NAME;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pduleba.spring.java.configuration.beans.Command;
import com.pduleba.spring.java.configuration.beans.CommandImpl;
import com.pduleba.spring.java.configuration.beans.Service;
import com.pduleba.spring.java.configuration.beans.ServiceImpl;

@Configuration
public class SpringConfig {
	
	@Bean(name=SERVICE_BEAN_NAME)
	public Service service() {
		return new ServiceImpl() {
			@Override
			public Command generateCommand() {
				return createCommand();
			}
		};
	}
	
	@Bean
	@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Command createCommand() {
		return new CommandImpl();
	}	
}
