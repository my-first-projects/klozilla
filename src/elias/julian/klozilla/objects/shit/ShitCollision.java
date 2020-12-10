package elias.julian.klozilla.objects.shit;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.Audio;
import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;

public class ShitCollision {

	private Timer kollision;

	public ShitCollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				for (int i = 0; i < Var.numberOfShit; i++) {

					
					// Collision between player and shit
					if (Var.playerX >= Var.shitX[i] - 100 && Var.playerX <= Var.shitX[i] + 100
							&& Var.playerY >= Var.shitY[i] - 100 && Var.playerY <= Var.shitY[i] + 100) {
						Var.shitY[i] = Var.screenHeight + 1000;
						Var.score++;
						AudioManager.playAudioToiletPlopp();
						
						System.out.println("Score changed to " + Var.score);
						if(Var.score > Var.highScore) {
							Var.highScore = Var.score;
							System.out.println("Highscore changed to " + Var.highScore);
						}
					}
					
					// Collision between bottom and shit || Var.shitY[i] <= Var.screenHeight + 100 && Var.shitY[i] >= Var.screenHeight
					if(Var.shitY[i] >= Var.screenHeight && Var.shitY[i] <= Var.screenHeight + 100) {
						
						// Move shitBackground
						Var.shitBackgroundY -= Var.shitBackgroundSpeed;
						
						// Counter
						Var.temp++;
						System.out.println("Triggered: " + Var.temp + " | " + Var.shitBackgroundY);
						
						
						// Reset shit cooridnates
						Var.shitY[i] = Var.screenHeight + 1000;
						if(Var.shitBackgroundY <= 0) {
							AudioManager.playAudioGameOver();
							Var.gameState = GameState.GAME_OVER;
						}
					}
				}
			}

		}, 0, 5);
	}

}
