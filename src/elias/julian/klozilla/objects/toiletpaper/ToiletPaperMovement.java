// Julian
package elias.julian.klozilla.objects.toiletpaper;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;

public class ToiletPaperMovement {


	private Timer movement;
	private Random rnd;

	public ToiletPaperMovement() {

		rnd = new Random();
		movement = new Timer();

		// Var.resetGame();

		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.gameState == GameState.GAME) {
					// If(level =1
					Var.toiletPaperY += Var.toiletPaperSpeed;
					if(Var.stopWatchY >= -1000 && Var.stopWatchY <= -990) {
						AudioManager.playAudioBell();
					}
					if (Var.toiletPaperY >= Var.screenHeight + 110) {// ----------------------------------
						// startet neu oben

						if (Var.toiletPaperY >= Var.shitDistance) {
							Var.toiletPaperY = 0 - rnd.nextInt(5000);
							if(!Var.isStopWatchEnabled) {
								Var.toiletPaperSpeed = rnd.nextInt(2) + 4;
							}
							Var.toiletPaperX = rnd.nextInt(600);
						}

					}
				}

			}

		}, 0, 10);
	}

	
}
