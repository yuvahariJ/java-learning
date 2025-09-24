package com.createSpringContext.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld objHelloWorld=(HelloWorld) context.getBean("helloWorldAgain");
		System.err.println(objHelloWorld);
	}
}
