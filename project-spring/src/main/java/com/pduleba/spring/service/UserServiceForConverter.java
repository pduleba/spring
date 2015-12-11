package com.pduleba.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.pduleba.task.UserTask;

import lombok.Data;

@Service(UserServiceForConverter.USER_SERVICE_WITH_CONVERTION_SERVICE_BEAN_NAME)
public @Data class UserServiceForConverter {

	public static final String USER_SERVICE_WITH_CONVERTION_SERVICE_BEAN_NAME = "userServiceWithConvertionService";
	
	private UserTask task;

	@Autowired
	public UserServiceForConverter(ConversionService conversionService) {
		super();
		this.task = conversionService.convert("1,PGSUserType", UserTask.class);
	}
	
	
	
}
