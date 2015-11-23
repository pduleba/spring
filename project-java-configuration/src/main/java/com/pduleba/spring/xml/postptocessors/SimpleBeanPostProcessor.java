package com.pduleba.spring.xml.postptocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SimpleBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(new StringBuilder().append("postProcessBeforeInitialization :: ").append(beanName).toString());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(new StringBuilder().append("postProcessAfterInitialization :: ").append(beanName).toString());
		return bean;
	}

}
