package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		 
		
		 ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/autowiring/applicationcontext.xml");
		 
		 Student student = (Student) ac.getBean("studentbean");
		 
		 
		 System.out.println(student);
		 
	
		 
		 
	}
}
