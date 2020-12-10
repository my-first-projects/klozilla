// Julian
package elias.julian.klozilla.objects.plunger;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;

public class PlungerMovement {

	private Timer movement;
	private Random rnd;

	public PlungerMovement() {

		rnd = new Random();
		movement = new Timer();

		// Var.resetGame();

		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.gameState == GameState.GAME) {
					// If(level =1
					Var.plungerY += Var.plungerSpeed;
					if(Var.stopWatchY >= -1000 && Var.stopWatchY <= -990) {
						AudioManager.playAudioBell();
					}
					if (Var.plungerY >= Var.screenHeight + 110) {// ----------------------------------
						// startet neu oben
						if (Var.plungerY >= Var.shitDistance) {
							Var.plungerY = 0 - rnd.nextInt(3000);
							if(!Var.isStopWatchEnabled) {
								Var.plungerSpeed = rnd.nextInt(2) + 4;
							}
							Var.plungerX = rnd.nextInt(600);
						}
					}
				}

			}

		}, 0, 10);
	}

}