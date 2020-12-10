package elias.julian.klozilla.objects.plunger;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.Audio;
import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.main.Var;

public class PlungerCollision {

	private Timer kollision;

	public PlungerCollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// Collision between player and shit
				if (Var.playerX >= Var.plungerX - 100 && Var.playerX <= Var.plungerX + 100
						&& Var.playerY >= Var.plungerY - 100 && Var.playerY <= Var.plungerY + 100) {
					Var.plungerY = Var.screenHeight + 1000;
					AudioManager.playAudioToiletPlopp();
					
					Var.shitBackgroundY += Var.shitBackgroundSpeed;
					if (Var.shitBackgroundY > Var.screenHeight) {
						Var.shitBackgroundY = Var.screenHeight;
					}
				}
			}

		}, 0, 5);
	}

}
