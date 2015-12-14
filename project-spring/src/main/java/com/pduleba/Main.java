package com.pduleba;

import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pduleba.model.UserModel;
import com.pduleba.model.parameters.UserModelParam;
import com.pduleba.model.utils.AppUtils;
import com.pduleba.spring.UserService;

public class Main implements AutoCloseable, UserModelParam {

	public static final Logger LOG = LoggerFactory.getLogger(Main.class);

	private ConfigurableApplicationContext context;

	private UserService bean;
	
	public Main() {
		this.context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		this.bean = context.getBean(UserService.class);
	}
	
	public static void main(String[] args) {
		try (Main main = new Main()) {
			LOG.info("------------");
			main.validateByBeanApi(VALID_USER, INVALID_USER);
			main.validateBySpringApi(VALID_USER, INVALID_USER);
			main.validateByValidAnnotation(VALID_USER, INVALID_USER);
		}
		
		LOG.info("Complete.");
	}
	
	private void validateByBeanApi(UserModel validUser, UserModel invalidUser) {
		bean.validateByBeanApi(validUser, invalidUser);
	}
	
	private void validateBySpringApi(UserModel validUser, UserModel invalidUser) {
		bean.validateBySpringApi(validUser, invalidUser);
	}

	private void validateByValidAnnotation(UserModel validUser, UserModel invalidUser) {
		try {
			bean.validateByValidAnnotation(validUser);
			AppUtils.logValidationStatus(LOG, "Validate by @Valid", true, 0);
		} catch (ConstraintViolationException e) {
			AppUtils.logValidationStatus(LOG, "Validate by @Valid", false, e.getConstraintViolations().size());
		}
		try {
			bean.validateByValidAnnotation(invalidUser);
			AppUtils.logValidationStatus(LOG, "Validate by @Valid", true, 0);
		} catch (ConstraintViolationException e) {
			AppUtils.logValidationStatus(LOG, "Validate by @Valid", false, e.getConstraintViolations().size());
		}
	}

	@Override
	public void close() {
		context.close();
	}
}
