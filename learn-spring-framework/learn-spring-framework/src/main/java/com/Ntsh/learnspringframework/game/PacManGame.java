package com.Ntsh.learnspringframework.game;

public class PacManGame implements GamingConsole{
	
	public void up() {
		System.out.println("move up");
	}
	public void down() {
		System.out.println("go down");
	}
	public void right() {
		System.out.println("move fw");
	}
	public void left() {
		System.out.println("go back");
	}

}
