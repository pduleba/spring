package com.pduleba.spring.xml.configuration.beans;

public interface LazyLoggerServiceApi {

	public static final String LAZY_BEAN_BEAN_NAME = "lazyBean";
	
	void log(String arg);

}
