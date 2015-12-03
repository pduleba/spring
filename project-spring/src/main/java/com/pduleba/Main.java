package com.pduleba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pduleba.spring.ServiceApi;

public class Main {

	public static final Logger LOG = LoggerFactory.getLogger(Main.class);

	private ApplicationContext ctx;
	private ServiceApi singletonBean;
	
	public Main() {
		ctx = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		singletonBean = ctx.getBean("singletonBean", ServiceApi.class);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		LOG.info("------------");
		main.applicationContextAwareTestCase();
	}

	private void applicationContextAwareTestCase() {
		LOG.info("work :: {} ", singletonBean.work());
		LOG.info("work :: {} ", singletonBean.work());
		LOG.info("work :: {} ", singletonBean.work());
		LOG.info("work :: {} ", singletonBean.work());
		LOG.info("work :: {} ", singletonBean.work());
	}
}
