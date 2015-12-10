package com.pduleba.spring.java.configuration.beans;

import java.text.MessageFormat;

import lombok.Data;

public @Data class CommandImpl implements Command {

	public static int INDEX = 0;
	
	private String taskId;

	public CommandImpl() {
		INDEX++;
	}

	@Override
	public String execute() {
		return MessageFormat.format("Command result :: {0} of bean index {1}", taskId, INDEX);
	}

}
