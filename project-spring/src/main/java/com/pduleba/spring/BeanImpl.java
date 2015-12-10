package com.pduleba.spring;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@NoArgsConstructor
@ToString
public @Data class BeanImpl implements BeanApi {

	private String valueA;
	private String valueB;
	private Resource resource;

	public BeanImpl(String valueA, String valueB) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
	}

}
