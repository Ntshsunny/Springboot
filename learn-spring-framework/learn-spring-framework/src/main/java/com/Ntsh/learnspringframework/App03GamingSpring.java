package com.Ntsh.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Ntsh.learnspringframework.game.GameRunner;
import com.Ntsh.learnspringframework.game.GamingConsole;
import com.Ntsh.learnspringframework.game.MarioGame;
import com.Ntsh.learnspringframework.game.PacManGame;
import com.Ntsh.learnspringframework.game.SuperContraGame;

public class App03GamingSpring {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			//  System.out.println(context.getBean(GamingConsole.class));
			  
			  context.getBean(GameRunner.class).run();
		}
		}
}
