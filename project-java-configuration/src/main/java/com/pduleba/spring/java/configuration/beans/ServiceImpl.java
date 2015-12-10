package com.pduleba.spring.java.configuration.beans;

import lombok.Data;

@Data
public class ServiceImpl implements Service {
	
	private Command command;

	public ServiceImpl(Command command) {
		this.command = command;
	}

	public String execute() {
		return command.execute();
	}
	
}
