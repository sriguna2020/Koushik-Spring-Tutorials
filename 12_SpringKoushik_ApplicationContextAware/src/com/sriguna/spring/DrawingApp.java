package com.sriguna.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		//Triangle triangle = new Triangle();
		
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();

	
	
	}

}
