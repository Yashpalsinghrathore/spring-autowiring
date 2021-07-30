package com.spring.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		 
		
		 ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/autowiring/annotation/applicationcontext.xml");
		 
		 Student student = ac.getBean("studentbean",Student.class);
		 
		 
		 System.out.println(student);
		 
	
		 
		 
	}
}
