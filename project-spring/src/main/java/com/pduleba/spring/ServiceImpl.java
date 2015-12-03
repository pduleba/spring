package com.pduleba.spring;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public @Data class ServiceImpl implements ServiceApi {

	private ServiceApi target;

	@Override
	public String toString() {
		return "ServiceImpl [target=" + target + "]";
	}
	
}
