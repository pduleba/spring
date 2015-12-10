package com.pduleba.spring.java.configuration.beans;

import lombok.Data;

@Data
public abstract class ServiceImpl implements Service {

	@Override
	public String execute(String taskId) {
		Command command = generateCommand();
		command.setTaskId(taskId);
		return command.execute();
	}
	
}
