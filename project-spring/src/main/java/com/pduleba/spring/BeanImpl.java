package com.pduleba.spring;

import org.springframework.stereotype.Component;

@Component
public class BeanImpl implements BeanApi {

	public static interface InnerApi {
		
	}
	
	static class InnerImpl implements InnerApi {
		
	}
}
