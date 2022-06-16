package com.h2kinfosys.spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
	//	Greetings greet = context.getBean(Greetings.class);
		// greet.sayHello();
	//	Employee emp = context.getBean(Employee.class);
		
	//	Manager mager = context.getBean(Manager.class);
		
		MSWord msword = context.getBean(MSWord.class);
		
		context.close();

	}

}
