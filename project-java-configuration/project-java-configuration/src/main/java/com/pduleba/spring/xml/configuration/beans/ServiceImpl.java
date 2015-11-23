package com.pduleba.spring.xml.configuration.beans;

import lombok.Data;

@Data
class ServiceImpl implements ServiceApi {

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

}
