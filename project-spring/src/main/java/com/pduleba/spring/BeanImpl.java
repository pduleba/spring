package com.pduleba.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.pduleba.spring.lifecycle.AppSmartLifecycle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
public @Data class BeanImpl extends AppSmartLifecycle implements BeanApi {

	public static final Logger LOG = LoggerFactory.getLogger(BeanImpl.class);
	
	private String valueA;
	private String valueB;

	@PostConstruct
	public void doInit() {
		LOG.info("doInit()");
		start();
	}
	
	@PreDestroy
	public void doDestroy() {
		LOG.info("doDestroy()");
	}
	
}
