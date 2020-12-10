package elias.julian.klozilla.main;

import elias.julian.klozilla.audio.Audio;
import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.gamehandler.DifficultyChanger;
import elias.julian.klozilla.gamehandler.KeyHandler;
import elias.julian.klozilla.gamehandler.Time;
import elias.julian.klozilla.gui.Gui;
import elias.julian.klozilla.gui.Label;
import elias.julian.klozilla.gui.LoadingGui;
import elias.julian.klozilla.gui.LoadingLabel;
import elias.julian.klozilla.jumpscare.JumpScare;
import elias.julian.klozilla.objects.background.BackgroundMovement;
import elias.julian.klozilla.objects.player.PlayerMovement;
import elias.julian.klozilla.objects.plunger.PlungerCollision;
import elias.julian.klozilla.objects.plunger.PlungerMovement;
import elias.julian.klozilla.objects.shit.ShitCollision;
import elias.julian.klozilla.objects.shit.ShitMovement;
import elias.julian.klozilla.objects.sponge.SpongeCollision;
import elias.julian.klozilla.objects.sponge.SpongeMovement;
import elias.julian.klozilla.objects.stopwatch.StopWatchCollision;
import elias.julian.klozilla.objects.stopwatch.StopWatchMovement;
import elias.julian.klozilla.objects.toiletpaper.ToiletPaperCollision;
import elias.julian.klozilla.objects.toiletpaper.ToiletPaperMovement;

public class Main {

	public static void main(String[] args) {
		new Audio();
		
		new KeyHandler();
		new Label();
		new Gui();
		new Var();
		new PlayerMovement();
		new ToiletPaperMovement();
		new ToiletPaperCollision();
		new PlungerMovement();
		new PlungerCollision();
		new ShitMovement();
		new ShitCollision();
		new DifficultyChanger();
		new Time();
		new SpongeMovement();
		new SpongeCollision();
		new BackgroundMovement();
		new StopWatchCollision();
		new StopWatchMovement();
		new JumpScare();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AudioManager.playAudioStarting();AudioManager.playAudioStarting();
	}
}
