package elias.julian.klozilla.jumpscare;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;


public class JumpScare {
	private static Timer changer;
	private static int counter;

	public JumpScare() {
		changer = new Timer();
		
		if(Var.jumpscare)start();
	}

	private static void start() {
		changer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				counter++;
				if(counter == 20){
					AudioManager.playAudioJumpscare();
					Var.gameState = GameState.JUMPSCARE;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Var.gameState = GameState.GAME;
				}
			}
		}, 0, 1000);
	}

}
