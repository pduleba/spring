package com.pduleba.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pduleba.task.UserTask;

import lombok.Data;

@Service(UserServiceForPropertyEditor.USER_SERVICE_WITH_PROPERTY_EDITOR_BEAN_NAME)
public @Data class UserServiceForPropertyEditor {

	public static final String USER_SERVICE_WITH_PROPERTY_EDITOR_BEAN_NAME = "userServiceWithPropertyEditor";
	
	@Value("1,PGSUserType")
	private UserTask task;
	
}
