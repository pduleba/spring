package com.pduleba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pduleba.spring.BeanImpl.InnerApi;

public class Main {

	private ApplicationContext ctx;

	public Main() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.checkAliases();
		main.checkInnerClass();
	}

	private void checkInnerClass() {
		Object inner_bean = ctx.getBean("inner_bean");
		System.out.println("inner_bean = " + inner_bean);
		System.out.println("inner_bean instanceof InnerApi= " + (inner_bean instanceof InnerApi));
	}

	private void checkAliases() {
		Object bean = ctx.getBean("bean");
		Object bean_a = ctx.getBean("bean_a");
		Object bean_b = ctx.getBean("bean_b");
		
		System.out.println("bean = " + bean);
		System.out.println("bean_a = " + bean_a);
		System.out.println("bean_b = " + bean_b);
		System.out.println("bean == bean_a = " + (bean == bean_a));
		System.out.println("bean == bean_b = " + (bean == bean_b));
		System.out.println("bean_a == bean_b = " + (bean_a == bean_b));
	}
	
}
