package com.Ntsh.learnspringframework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


 record Person (String name, int age, Address address) {};   // record create
 record Address(String Add1, String Add2) {};
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "ntsh";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		var person = new Person("sunny", 30, new Address("old", "ny"));
		
		return person;
	}
	
	@Bean
	@Primary
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address());
		
		return person;
	}
	
	@Bean
	public Person person3Parameter(String name, int age, Address add2) { // calling with parameters
		var person = new Person(name, age, add2);
		
		return person;
	}
	
	@Bean(name = "add")    // can change the bean name from address to add without changing the method name
	public Address address() {
		var address = new Address("guilderland", "ny");
		return address;
	}
	
	@Bean(name = "add2")    // can change the bean name from address to add without changing the method name
	@Primary
	public Address address2() {
		var address2 = new Address("heritage", "ny");
		return address2;
	}
}
