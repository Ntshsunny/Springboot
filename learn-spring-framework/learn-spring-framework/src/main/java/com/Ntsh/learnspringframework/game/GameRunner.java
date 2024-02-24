package com.Ntsh.learnspringframework.game;

public class GameRunner {
	
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		
		System.out.println("running Game  "+game);
		game.down();
		game.up();
		game.right();
		game.left();
		
	}

}
