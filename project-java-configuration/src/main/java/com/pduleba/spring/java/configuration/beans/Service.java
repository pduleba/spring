package com.pduleba.spring.java.configuration.beans;

public interface Service {

	public static final String SERVICE_BEAN_NAME = "service";

	String execute(String taskId);

	Command generateCommand();
}
