package com.pduleba.spring.xml.configuration.beans;

import lombok.Data;

public @Data class LazyLoggerServiceImpl implements LazyLoggerServiceApi {

	private static final String LOG_PREFIX = "LOG : ";

	public LazyLoggerServiceImpl() {
		System.out.println("Lazy Logger initialization");
	}
	
	public void log(String arg) {
		System.out.println(new StringBuilder(LOG_PREFIX).append(arg).toString());
	}
	
}
