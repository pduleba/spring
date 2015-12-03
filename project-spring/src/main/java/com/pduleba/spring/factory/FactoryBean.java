package com.pduleba.spring.factory;

import com.pduleba.spring.BeanApi;
import com.pduleba.spring.BeanImpl;

public class FactoryBean {

	public BeanApi createNewBeanApi() {
		return new BeanImpl();
	}
	
}
