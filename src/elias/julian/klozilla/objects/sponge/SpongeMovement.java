package elias.julian.klozilla.objects.sponge;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;

public class SpongeMovement {

	private Timer movement;
	private Random rnd;

	public SpongeMovement() {

		rnd = new Random();
		movement = new Timer();

		// Var.resetGame();

		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.gameState == GameState.GAME) {
					// If(level =1
					Var.spongeY += Var.spongeSpeed;
					if (Var.spongeY >= Var.screenHeight + 110) {// ----------------------------------
						// startet neu oben
						if (Var.spongeY >= Var.shitDistance) {
							Var.spongeY = -10000 - rnd.nextInt(3000);
							Var.spongeX = rnd.nextInt(600);
						}
					}
				}

			}

		}, 0, 10);
	}

}