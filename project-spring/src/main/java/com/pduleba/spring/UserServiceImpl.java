package com.pduleba.spring;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.groups.Default;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.pduleba.model.UserModel;

import lombok.Data;
import lombok.ToString;

@ToString
@Service
public @Data class UserServiceImpl implements UserService {
	
	public static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private javax.validation.Validator validatorBeanApi;
	
	@Autowired
	private Validator validatorSpringApi;

	@Override
	public void execute() {

		UserModel validUser = new UserModel("Marek", "Kowalski", 0);
		UserModel invalidUser = new UserModel(null, "Kowalski", -2);
		
		validateBySpringApi(validUser, invalidUser);
		validateByBeanApi(validUser, invalidUser);
		
		LOG.info("Complete.");
	}

	private void validateByBeanApi(UserModel validUser, UserModel invalidUser) {
		Set<ConstraintViolation<UserModel>> result = null;
		
		result = validatorBeanApi.validate(validUser, Default.class);
		LOG.info("BeanApi :: valid :: error count :: {}", result.size());
		
		result = validatorBeanApi.validate(invalidUser, Default.class);
		LOG.info("BeanApi :: invalid :: error count :: {}", result.size());
	}

	private void validateBySpringApi(UserModel validUser, UserModel invalidUser) {
		Errors errors = null;
		
		errors = new BeanPropertyBindingResult(this, "user");
		validatorSpringApi.validate(validUser, errors);
		LOG.info("BeanApi :: valid :: error count :: {}", errors.getErrorCount());
		
		errors = new BeanPropertyBindingResult(this, "user");
		validatorSpringApi.validate(invalidUser, errors);
		LOG.info("BeanApi :: invalid :: error count :: {}", errors.getErrorCount());
	}

}
