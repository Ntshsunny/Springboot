package com.Ntsh.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{
	
	public void up() {
		System.out.println("jump in contra");
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
