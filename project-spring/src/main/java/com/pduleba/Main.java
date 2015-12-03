package com.pduleba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pduleba.spring.BeanImpl.InnerApi;
import com.pduleba.spring.annotation.AnnotationBeanImpl;

public class Main {

	public static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	private ApplicationContext ctx;

	public Main() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static void main(String[] args) {
		Main main = new Main();
//		main.checkAliases();
//		LOG.info("------------");
//		main.checkAnnotationConfigAliases();
//		LOG.info("------------");
//		main.checkInnerClass();
//		LOG.info("------------");
//		main.multiNameBean();
//		LOG.info("------------");
//		main.factoryMethod();
//		LOG.info("------------");
//		main.factoryBean();
//		LOG.info("------------");
//		main.constructorBaseBeanCreation();
		LOG.info("------------");
		main.circularBeanCreationCheck();
	}

	private void circularBeanCreationCheck() {
		Object setter_based_chicken_a = ctx.getBean("setter_based_chicken_a");
		Object setter_based_chicken_b = ctx.getBean("setter_based_chicken_b");
		
		LOG.info("setter based circular Chicken bean  {} ", setter_based_chicken_a);
		LOG.info("setter based circular Chicken bean  {} ", setter_based_chicken_b);

		Object constructor_based_chicken_a = ctx.getBean("constructor_based_chicken_a");
		Object constructor_based_chicken_b = ctx.getBean("constructor_based_chicken_b");
		
		LOG.info("setter based circular Chicken bean  {} ", constructor_based_chicken_a);
		LOG.info("setter based circular Chicken bean  {} ", constructor_based_chicken_b);
	}

	private void constructorBaseBeanCreation() {
		Object bean = ctx.getBean("multiArgumentBean");
		
		LOG.info("multi-constructor-bean {}", bean);
	}
	
	private void factoryBean() {
		Object bean = ctx.getBean("factory-bean");
		
		LOG.info("factory-bean {}", bean);
	}

	private void factoryMethod() {
		Object bean = ctx.getBean("factory-method");
		Object inner_bean = ctx.getBean("factory-inner_method");
		
		LOG.info("factory-bean {}", bean);
		LOG.info("factory-inner_bean {}", inner_bean);
	}

	private void multiNameBean() {
		for (int i = 1; i <=5;i++) {
			String beanName = new StringBuilder("bean-").append(i).toString();
			Object bean = ctx.getBean(beanName);
			
			LOG.info("{} = {}", beanName, bean);
		}
	}

	private void checkAnnotationConfigAliases() {
		Object bean_a = ctx.getBean(AnnotationBeanImpl.ANNOTATION_BEAN_A_NAME);
		Object bean_b = ctx.getBean(AnnotationBeanImpl.ANNOTATION_BEAN_B_NAME);
		
		LOG.info("Annotation Config : bean_a == bean_b = " + (bean_a == bean_b));
	}

	private void checkInnerClass() {
		Object inner_bean = ctx.getBean("inner_bean");
		LOG.info("inner_bean = " + inner_bean);
		LOG.info("inner_bean instanceof InnerApi= " + (inner_bean instanceof InnerApi));
	}

	private void checkAliases() {
		Object bean = ctx.getBean("bean");
		Object bean_a = ctx.getBean("bean_a");
		Object bean_b = ctx.getBean("bean_b");
		
		LOG.info("bean = " + bean);
		LOG.info("bean_a = " + bean_a);
		LOG.info("bean_b = " + bean_b);
		LOG.info("bean == bean_a = " + (bean == bean_a));
		LOG.info("bean == bean_b = " + (bean == bean_b));
		LOG.info("bean_a == bean_b = " + (bean_a == bean_b));
	}
	
}
