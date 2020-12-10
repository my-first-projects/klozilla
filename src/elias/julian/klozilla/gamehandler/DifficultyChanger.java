package elias.julian.klozilla.gamehandler;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.Audio;
import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.main.Var;

public class DifficultyChanger {
	private static Timer changer;

	public DifficultyChanger() {
		changer = new Timer();
		start();
	}

	private static void start() {
		changer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.gameState == GameState.GAME) {
					if(Var.difficultyChangerCounter == 10) {
						Var.difficultyChangerCounter = 0;
						Var.level++;
						AudioManager.playAudioLevelUp();
						Var.shitDistance -= Var.shitBackgroundSpeed;
					}
				}
			}
		}, 0, 10);
	}

}