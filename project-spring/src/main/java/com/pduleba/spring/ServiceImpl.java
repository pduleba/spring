package com.pduleba.spring;

import static java.util.Objects.isNull;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
@AllArgsConstructor
public @Data class ServiceImpl implements ServiceApi {

	private ServiceImpl service;
	private String valueA;
	private String valueB;

	public ServiceImpl(String valueA, String valueB) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.service = new ServiceImpl();
	}

	@Override
	public String toString() {
		if (isNull(service)) {
			return "ServiceImpl [valueA=" + valueA + ", valueB=" + valueB + "]";
		} else {
			return "ServiceImpl [valueA=" + valueA + ", valueB=" + valueB + ", service=" + service + "]";
		}
	}	
}
