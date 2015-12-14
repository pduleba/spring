package com.pduleba.spring;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.groups.Default;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

import com.pduleba.model.UserModel;
import com.pduleba.model.utils.AppUtils;

import lombok.Data;
import lombok.ToString;

@ToString
@Service
@Validated
public @Data class UserServiceImpl implements UserService {
	
	public static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private javax.validation.Validator validatorBeanApi;
	
	@Autowired
	private Validator validatorSpringApi;

	public void validateByValidAnnotation(@Valid UserModel user) {
		// Intentionally left empty
	}

	public void validateByBeanApi(UserModel validUser, UserModel invalidUser) {
		Set<ConstraintViolation<UserModel>> result = null;
		
		result = validatorBeanApi.validate(validUser, Default.class);
		AppUtils.logValidationStatus(LOG, "Bean API", true, result.size());
		
		result = validatorBeanApi.validate(invalidUser, Default.class);
		AppUtils.logValidationStatus(LOG, "Bean API", false, result.size());
	}

	public void validateBySpringApi(UserModel validUser, UserModel invalidUser) {
		Errors errors = null;
		
		errors = new BeanPropertyBindingResult(this, "user");
		validatorSpringApi.validate(validUser, errors);
		AppUtils.logValidationStatus(LOG, "Spring API", true, errors.getErrorCount());
		
		errors = new BeanPropertyBindingResult(this, "user");
		validatorSpringApi.validate(invalidUser, errors);
		AppUtils.logValidationStatus(LOG, "Spring API", false, errors.getErrorCount());
	}

}
