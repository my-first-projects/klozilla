package elias.julian.klozilla.objects.sponge;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.Audio;
import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.main.Var;

public class SpongeCollision {

	private Timer kollision;

	public SpongeCollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// Collision between player and sponge
				if (Var.playerX >= Var.spongeX - 100 && Var.playerX <= Var.spongeX + 100
						&& Var.playerY >= Var.spongeY - 100 && Var.playerY <= Var.spongeY + 100) {
					Var.spongeY = Var.screenHeight + 1000;
					
					AudioManager.playAudioToiletPlopp();
					
					Var.shitBackgroundY = Var.screenHeight;
					
					
				}
			}

		}, 0, 5);
	}

}
