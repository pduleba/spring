package com.pduleba.spring;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public @Data class MessageServiceImpl implements MessageService {

	private String prefix = "spring :: ";
	
	@Override
	public String getMessage(String input) {
		return new StringBuilder(prefix).append(input).toString();
	}

}
