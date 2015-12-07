package com.pduleba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pduleba.spring.AppBean;
import com.pduleba.spring.AppBeanFactory;

public class Main {

	public static final Logger LOG = LoggerFactory.getLogger(Main.class);

	private ApplicationContext ctx;
	
	public Main() {
		ctx = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
	}
	
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		LOG.info("------------");
		main.test();
	}

	private void test() throws Exception {
		FactoryBean<AppBean> factoryBean = ctx.getBean("&factoryBean", AppBeanFactory.class);
		LOG.info("Bean :: {}", factoryBean.getObject());
	}
}
