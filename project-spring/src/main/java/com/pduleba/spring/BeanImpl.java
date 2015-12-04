package com.pduleba.spring;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
public @Data class BeanImpl implements BeanApi {

	private String valueA;
	private String valueB;

}
