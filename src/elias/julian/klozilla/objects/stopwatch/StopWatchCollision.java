package elias.julian.klozilla.objects.stopwatch;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.Audio;
import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.main.Var;

public class StopWatchCollision {

	private Timer kollision;
	private static Random rnd;
	
	public StopWatchCollision() {
		rnd = new Random();
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				// Collision between player and StopWatch
				if (Var.playerX >= Var.stopWatchX - 100 && Var.playerX <= Var.stopWatchX + 100
						&& Var.playerY >= Var.stopWatchY - 100 && Var.playerY <= Var.stopWatchY + 100) {
					Var.stopWatchY = Var.screenHeight + 1000;

					AudioManager.playAudioToiletPlopp();
					
					Var.isStopWatchEnabled = true;
					startStopWatch();
				}
			}
		}, 0, 5);
	}
	
	public static void startStopWatch() {
		
		AudioManager.playAudioSlowDown();
		
		for(int i = 0; i < Var.numberOfShit; i++) {
			Var.shitSpeed[i] = rnd.nextInt(2) + 1;
		}
		Var.spongeSpeed = Var.spongeSpeed/2;
		Var.plungerSpeed = Var.plungerSpeed/2;
		Var.toiletPaperSpeed = Var.toiletPaperSpeed/2;
		Var.shitBackgroundXSpeed = Var.shitBackgroundXSpeed = 2 / 2;
		
		try {
			Thread.sleep(5000 + Var.level * 50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		AudioManager.playAudioSpeedUp();
		for(int i = 0; i < Var.numberOfShit; i++) {
			Var.shitSpeed[i] = rnd.nextInt(2) + 4;
		}

		Var.shitBackgroundXSpeed = Var.shitBackgroundXSpeed = 2 * 2;
		Var.spongeSpeed = 10;
		Var.plungerSpeed = 10;
		Var.toiletPaperSpeed = 10;
		
	}
}