package com.Ntsh.learnspringframework.example.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("all dependencies are ready");
	}
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
		System.out.println("PostConstruct is calling");
	}
	
	@PreDestroy
	public void cleanup()
	{
		System.out.println("clean up");
	}
}

@Component
class SomeDependency{
	
	public void getReady() {
		System.out.println("tfgfgfgkj");
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
		
	}
}
