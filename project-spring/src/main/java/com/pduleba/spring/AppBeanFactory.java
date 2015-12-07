package com.pduleba.spring;

import org.springframework.beans.factory.FactoryBean;

import lombok.Data;
import lombok.ToString;

@ToString
public @Data class AppBeanFactory implements FactoryBean<AppBean> {
	
	private final static AppBean BEAN_SINGLETON_INSTANCE = new AppBean();
	
	public AppBean getObject() throws Exception {
		return BEAN_SINGLETON_INSTANCE;
	}

	@Override
	public Class<AppBean> getObjectType() {
		return AppBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}



}
