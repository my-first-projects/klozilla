package elias.julian.klozilla.objects.shit;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.Audio;
import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;

import java.util.Random;

public class ShitMovement {

	private Timer movement;
	private Random rnd;
	private int shitMinY = 0;

	public ShitMovement() {

		rnd = new Random();
		movement = new Timer();

		// Var.resetGame();

		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.gameState == GameState.GAME) {
					// If(level =1
					for (int i = 0; i < Var.numberOfShit; i++) {
						Var.shitY[i] += Var.shitSpeed[i];
						if (Var.shitY[i] >= Var.screenHeight + 110) {// ----------------------------------
							// startet neu oben
							
							
							
							// Shit mit geringsten Y-Wert
							for (int x = 0; x < Var.numberOfShit; x++) {
								if (Var.shitY[x] < Var.shitY[shitMinY]) {
									shitMinY = x;
									
								}
							}
							//Hier
								if (Var.shitY[shitMinY] >= Var.shitDistance) {
									Var.shitY[i] = 0 - rnd.nextInt(100);
									if(!Var.isStopWatchEnabled) {
										Var.shitSpeed[i] = rnd.nextInt(2) + 4;
									}
									Var.shitX[i] = rnd.nextInt(600);
									//Audio.playMusic("audio/scheisse.wav");	
								}
							shitMinY = 0;

							/*
							 * if(i == 0) { if(Var.shitY[1] >= 300) { Var.shitY[i] = 0 - rnd.nextInt(100);
							 * Var.shitSpeed[i] = rnd.nextInt(2) + 4; Var.shitX[i] = rnd.nextInt(600); }else
							 * { //Kacke fällt weiter nach unten bis die andere Kacke bei 66,666666% der
							 * Strecke ist } }else if(i == 1) { if(Var.shitY[0] >= 300) { Var.shitY[i] = 0 -
							 * rnd.nextInt(100); Var.shitSpeed[i] = rnd.nextInt(2) + 4; Var.shitX[i] =
							 * rnd.nextInt(600); }else { //Kacke fällt weiter nach unten bis die andere
							 * Kacke bei 66,666666% der Strecke ist } }
							 */

						}
					}
				}

			}

		}, 0, 10);
	}

}
