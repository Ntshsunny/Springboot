package com.Ntsh.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("jump");
	}
	public void down() {
		System.out.println("go to hole");
	}
	public void right() {
		System.out.println("move fw");
	}
	public void left() {
		System.out.println("go back");
	}
	
}
