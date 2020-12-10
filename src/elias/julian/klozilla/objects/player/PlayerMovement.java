package elias.julian.klozilla.objects.player;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;

public class PlayerMovement {

	private Timer movement;

	public PlayerMovement() {

		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.gameState == GameState.GAME) {
					if (Var.playerMoveLeft == true) {
						if (Var.playerX > 0) {
							Var.playerX -= Var.playerSpeedLeft;
						}
					} else if (Var.playerMoveRight == true) {
						if (Var.playerX <= Var.screenWidth - 100) {
							Var.playerX += Var.playerSpeedRight;
						}
					}
				}

			}

		}, 0, 10);
	}

}
