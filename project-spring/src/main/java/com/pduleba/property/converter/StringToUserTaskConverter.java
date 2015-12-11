package com.pduleba.property.converter;

import org.springframework.core.convert.converter.Converter;

import com.pduleba.task.UserTask;

public class StringToUserTaskConverter implements Converter<String, UserTask> {

	@Override
	public UserTask convert(String source) {
		String[] split = source.split(",");
		return new UserTask(Integer.valueOf(split[0]),split[1].toUpperCase());
	}

}
