package com.Ntsh.learnspringframework.example.d1;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	
	private ClassA classA;

	public ClassB(ClassA classA) {
		super();
		System.out.println("Some Initalization logic");
		this.classA = classA;
	}
	
	public void doSomethng() {
		System.out.println("do somethng");
	}
		
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
			
			System.out.println("Initialization is completed");
			context.getBean(ClassB.class).doSomethng();

		}
		
	}
}
