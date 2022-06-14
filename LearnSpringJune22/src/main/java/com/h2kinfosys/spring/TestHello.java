package com.h2kinfosys.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld hello1 = context.getBean(HelloWorld.class);
		HelloWorld hello2 = context.getBean(HelloWorld.class);
		hello1.getMessage();
		hello2.getMessage();
		
		if(hello1.equals(hello2)) {
			System.out.println("Signleton Proved");
		}else {
			System.out.println("Not Singleton anymore");
		}
		
		Customer cust01 = context.getBean("customer", Customer.class);
		System.out.println(cust01);
		
		
		context.close();

	}

}
