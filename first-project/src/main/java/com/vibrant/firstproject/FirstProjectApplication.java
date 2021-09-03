package com.vibrant.firstproject;

import com.vibrant.firstproject.Game.GameRunner;
import com.vibrant.firstproject.Game.MarioGame;

import com.vibrant.firstproject.Game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FirstProjectApplication.class, args);
		MarioGame game=new MarioGame();
		//SuperContraGame game=new SuperContraGame();

		GameRunner gameRunner=new GameRunner(game);



		gameRunner.run();

	}

}
