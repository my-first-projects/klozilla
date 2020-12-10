package elias.julian.klozilla.objects.toiletpaper;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.Audio;
import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.main.Var;

public class ToiletPaperCollision {

	private Timer kollision;

	public ToiletPaperCollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// Collision between player and toiletPaper
				if (Var.playerX >= Var.toiletPaperX - 100 && Var.playerX <= Var.toiletPaperX + 100
						&& Var.playerY >= Var.toiletPaperY - 100 && Var.playerY <= Var.toiletPaperY + 100) {
					Var.toiletPaperY = Var.screenHeight + 1000;
					AudioManager.playAudioToiletPlopp();
					
					Var.shitBackgroundY -= Var.shitBackgroundSpeed;
					
					
				}
			}

		}, 0, 5);
	}

}
