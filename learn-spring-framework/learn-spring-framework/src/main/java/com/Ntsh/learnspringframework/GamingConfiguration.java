package com.Ntsh.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.Ntsh.learnspringframework.game.GameRunner;
import com.Ntsh.learnspringframework.game.GamingConsole;
import com.Ntsh.learnspringframework.game.MarioGame;
import com.Ntsh.learnspringframework.game.PacManGame;

public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	 @Bean
	 public GameRunner gameRunner(GamingConsole game) {
			var gameRunner = new GameRunner(game);
			return gameRunner;
		}

}
