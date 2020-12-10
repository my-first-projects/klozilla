package elias.julian.klozilla.objects.stopwatch;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;

public class StopWatchMovement {

	private Timer movement;
	private Random rnd;
	

	public StopWatchMovement() {

		rnd = new Random();
		movement = new Timer();

		// Var.resetGame();

		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.gameState == GameState.GAME) {
					// If(level =1
					Var.stopWatchY += Var.stopWatchSpeed;
					
					if(Var.stopWatchY >= -1000 && Var.stopWatchY <= -990) {
						AudioManager.playAudioBell();
					}
					
				
					if (Var.stopWatchY >= Var.screenHeight + 110) {// ----------------------------------
						// startet neu oben
						
						if (Var.stopWatchY >= Var.shitDistance) {
							Var.stopWatchY = -10000 - rnd.nextInt(3000);
							Var.stopWatchX = rnd.nextInt(600);
						}
					}
				}

			}

		}, 0, 10);
	}
	
}
