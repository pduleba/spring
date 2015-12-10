package com.pduleba.spring.java.configuration.beans;

import java.text.MessageFormat;

import lombok.Data;

public @Data class CommandImpl implements Command {

	public static int INDEX = 0;

	public CommandImpl() {
		INDEX++;
	}

	@Override
	public String execute() {
		return MessageFormat.format("Command result :: bean of index {0}", INDEX);
	}

}
