package elias.julian.klozilla.gamehandler;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.main.Var;

public class Time {
	private static Timer changer;

	public Time() {
		changer = new Timer();
		start();
	}

	private static void start() {
		changer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.gameState == GameState.GAME) {
					Var.time++;
					Var.difficultyChangerCounter++;
				}

			}
		}, 0, 1000);
	}

}
