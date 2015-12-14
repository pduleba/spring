package com.pduleba.spring;

import javax.validation.Valid;

import com.pduleba.model.UserModel;

public interface UserService {

	void validateByBeanApi(UserModel validUser, UserModel invalidUser);

	void validateBySpringApi(UserModel validUser, UserModel invalidUser);

	void validateByValidAnnotation(@Valid UserModel user);
	
}
