package com.pduleba;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Main implements AutoCloseable {

	public static final Logger LOG = LoggerFactory.getLogger(Main.class);

	private ConfigurableApplicationContext context;
	
	public Main() {
		this.context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
	}
	
	public static void main(String[] args) {
		try (Main main = new Main()) {
			LOG.info("------------");
			main.test();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void test() throws IOException {
		Resource resource = context.getResource("classpath:applicationContext.xml");
		LOG.info("Bean :: {}", resource.getFile());
		LOG.info("Bean :: {}", context.getBean("bean"));
	}

	@Override
	public void close() {
		context.close();
	}
}
