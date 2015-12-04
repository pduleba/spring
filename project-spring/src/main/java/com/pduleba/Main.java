package com.pduleba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static final Logger LOG = LoggerFactory.getLogger(Main.class);

	private ConfigurableApplicationContext ctx;
	
	public Main() {
		ctx = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		ctx.registerShutdownHook();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		LOG.info("------------");
		main.test();
		
		main.close();
	}

	private void close() {
		ctx.close();
	}
	
	private void test() {
		LOG.info("Bean :: {}", ctx.getBean("bean"));
	}
}

