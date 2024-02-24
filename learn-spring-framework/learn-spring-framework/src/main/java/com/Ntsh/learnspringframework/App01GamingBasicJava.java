package com.Ntsh.learnspringframework;

import com.Ntsh.learnspringframework.game.GameRunner;
import com.Ntsh.learnspringframework.game.MarioGame;
import com.Ntsh.learnspringframework.game.PacManGame;
import com.Ntsh.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		// var game = new MarioGame();
		
		//var game = new SuperContraGame();
		
		var game = new PacManGame();   // 1 obj creation
		 var gameRunner = new GameRunner(game);  
		 							// Obj creation + writing dependencies, game is dependency of GameRunner
		 gameRunner.run();
		 

	}

}
