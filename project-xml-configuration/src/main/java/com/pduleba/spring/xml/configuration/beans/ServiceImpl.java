package com.pduleba.spring.xml.configuration.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
class ServiceImpl implements ServiceApi, InitializingBean, DisposableBean {

	private String message;

	private TimeServiceApi timeService;

	public ServiceImpl(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getResult() {
		return new StringBuilder(message).append(" on ").append(timeService.getCurrentDate()).toString();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("ServiceImpl :: destroy() called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ServiceImpl :: afterPropertiesSet() called");
	}

}
