package com.pduleba.spring.postprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ToStringBeanPostProcessor implements BeanPostProcessor {

	public static final Logger LOG = LoggerFactory.getLogger(ToStringBeanPostProcessor.class);
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		LOG.info("postProcessBeforeInitialization :: {}", bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		LOG.info("postProcessAfterInitialization :: {}", bean);
		return bean;
	}

}
