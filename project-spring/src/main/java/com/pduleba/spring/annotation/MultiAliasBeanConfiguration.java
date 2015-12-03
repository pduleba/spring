package com.pduleba.spring.annotation;

import static com.pduleba.spring.annotation.AnnotationBeanApi.ANNOTATION_BEAN_A_NAME;
import static com.pduleba.spring.annotation.AnnotationBeanApi.ANNOTATION_BEAN_B_NAME;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultiAliasBeanConfiguration {

	@Bean(name={ANNOTATION_BEAN_A_NAME, ANNOTATION_BEAN_B_NAME})
	public AnnotationBeanApi createAnnotationBean() {
		return new AnnotationBeanImpl();
	}
	
}
