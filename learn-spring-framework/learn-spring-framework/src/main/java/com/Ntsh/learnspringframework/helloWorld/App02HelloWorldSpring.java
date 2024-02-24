package com.Ntsh.learnspringframework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// launch Spring Context
		//configure the things that we want spring to manage - @Configuration class
		//name - @Bean

		 try(var context= new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		 
		 {
			 System.out.println(context.getBean("name"));
			 
			 System.out.println(context.getBean("age"));
			 System.out.println(context.getBean("person"));
			 System.out.println(context.getBean("add"));
			 System.out.println(context.getBean(Address.class));
			 System.out.println(context.getBean(Person.class));
			 System.out.println("---------------");
			 System.out.println(context.getBean("person2MethodCall"));
			 System.out.println(context.getBean("person3Parameter"));
			 
			 
			 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		 }
		 ;	
		 
		 //retrieving Bean name
		
		 
	}

}
