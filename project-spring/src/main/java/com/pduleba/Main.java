package com.pduleba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static final Logger LOG = LoggerFactory.getLogger(Main.class);

	private ApplicationContext ctx;

	public Main() {
		ctx = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" },
				new ClassPathXmlApplicationContext("applicationContextParent.xml"));
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		LOG.info("------------");
		main.referenceToParentBean();
	}

	private void referenceToParentBean() {
		LOG.info("parent :: {} ", ctx.getBean("parentServiceBean"));
		LOG.info("child  :: {} ", ctx.getBean("childServiceBean"));
	}
}
