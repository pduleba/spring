package com.pduleba.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
public @Data class ServiceImpl implements ServiceApi, ApplicationContextAware {

	private String valueA;
	private String valueB;
	private ApplicationContext context;	
	
	@Override
	public int work() {
		return getComamnd().doWork();
	}

	private CommandApi getComamnd() {
		return context.getBean("command", CommandImpl.class);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;		
	}

}
