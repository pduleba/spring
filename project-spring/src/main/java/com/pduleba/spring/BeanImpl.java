package com.pduleba.spring;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
public @Data class BeanImpl implements Bean {

	private String valueA;
	private String valueB;

	private ChildBean childBean;

	public BeanImpl(String valueA, String valueB) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
	}

	@Required
	public void setChildBean(ChildBean childBean) {
		this.childBean = childBean;
	}

}
