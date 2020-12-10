package elias.julian.klozilla.objects.background;

import java.util.Timer;
import java.util.TimerTask;

import elias.julian.klozilla.main.Var;

public class BackgroundMovement {

	private Timer back;
	
	public BackgroundMovement() {
		
		Var.shitBackgroundX1 = 0;
		Var.shitBackgroundX2 = -800;
		
		back = new Timer();
		back.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if(Var.shitBackgroundX1 <= 795) {
					Var.shitBackgroundX1 += Var.shitBackgroundXSpeed;
				}else {
					Var.shitBackgroundX1 = -800;
				}
				
				
				if(Var.shitBackgroundX2 <= 795) {
					Var.shitBackgroundX2 += Var.shitBackgroundXSpeed;
				}else {
					Var.shitBackgroundX2 = -800;
				}
				
			}
			
			
		}, 0, Var.shitBackgroundMovingSpeed);
	}

}
