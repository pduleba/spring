package com.pduleba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static final Logger LOG = LoggerFactory.getLogger(Main.class);

	private ApplicationContext ctx;
	
	public Main() {
		ctx = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		LOG.info("------------");
		main.test();
	}

	private void test() {
		LOG.info("Bean :: {}", ctx.getBean("bean"));
		LOG.info("ParentBean :: {}", ctx.getBean("parentBean"));
	}
}

