package elias.julian.klozilla.main;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import elias.julian.klozilla.audio.Audio;
import elias.julian.klozilla.audio.AudioManager;
import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.gui.Label;

public class Var {

	public static int temp = 0;
	
	// GameState
	public static GameState gameState = GameState.LOADING;
	public static int level = 0;
	public static int time = 0;
	public static int shitDistance = 300;
	public static int difficultyChangerCounter = 0;
	public static boolean isLoaded = false;
	
	public static boolean jumpscare = false;
	
	// Audio
	public static boolean musicIsPlaying;
	
	// GUI
	public static JFrame JFGame;
	public static Label label;
	public static int screenWidth = 800, screenHeight = 600;
	
	// GUI
	public static JFrame JFLoading;
	public static Label loadingLabel;

	// Player
	public static int playerX = (screenWidth/2) - 50, playerY = 450;
	public static int playerSpeedLeft = 10, playerSpeedRight = 10;
	public static boolean playerMoveLeft = false;
	public static boolean playerMoveRight = false;
	public static int score = 0;
	public static int highScore = 0;
	public static int lastDirection = 1;

	// Shit
	public static int numberOfShit = 20;
	public static int[] shitX = new int[Var.numberOfShit];
	public static int[] shitY = new int[Var.numberOfShit];
	public static int[] shitSpeed = new int[Var.numberOfShit];
	
	// ShitBackground
	public static int shitBackgroundX1;
	public static int shitBackgroundX2;
	public static int shitBackgroundMovingSpeed = 10;
	
	public static int shitBackgroundSpeed = 30;
	public static int shitBackgroundXSpeed = 2;
	public static int shitBackgroundY = Var.screenHeight - Var.shitBackgroundSpeed;
	
	
	//Plunger
	public static int plungerX = 0;
	public static int plungerY = screenHeight + 110;
	public static int plungerSpeed = 10;
	
	// ToiletPaper
	public static int toiletPaperX = 0;
	public static int toiletPaperY = screenHeight + 110;
	public static int toiletPaperSpeed = 10;
	
	// Sponge
	public static int spongeX = 0;
	public static int spongeY = screenHeight + 110;
	public static int spongeSpeed = 10;
	
	// StopWatch
	public static int stopWatchX = 0;
	public static int stopWatchY = screenHeight + 110;
	public static int stopWatchSpeed = 10;
	public static boolean isStopWatchEnabled = false;

	
	

	// Images
	public static BufferedImage[] iShit = new BufferedImage[Var.numberOfShit];
	public static BufferedImage iBackground;
	public static BufferedImage iToilet1;
	public static BufferedImage iToilet2;
	public static BufferedImage iPlunger;
	public static BufferedImage iToiletPaper;
	public static BufferedImage iShitBackground1;
	public static BufferedImage iShitBackground2;
	public static BufferedImage iHomeBackground;
	public static BufferedImage iPauseBackground;
	public static BufferedImage iGameOverBackground;
	public static BufferedImage iSponge;
	public static BufferedImage iStopWatch;
	public static BufferedImage iLoading;
	public static BufferedImage iJumpscare;

	public Var() {
		try {
			// Loading
			//iLoading = ImageIO.read(new File("rsc/loading.gif"));
			iLoading = ImageIO.read(new File("rsc/loading.png"));
			// Background
			//iBackground = ImageIO.read(new File("rsc/Background.jpg"));
			iBackground = ImageIO.read(new File("rsc/Background2.png"));	
			// Shit
			for (int i = 0; i < Var.numberOfShit; i++) {
				iShit[i] = ImageIO.read(new File("rsc/shit.png"));
			}
			// ShitBackground
			iShitBackground1 = ImageIO.read(new File("rsc/shitBackground.png"));
			iShitBackground2 = ImageIO.read(new File("rsc/shitBackground.png"));
			
			// Toilet
			iToilet1 = ImageIO.read(new File("rsc/toilet1.png"));
			iToilet2 = ImageIO.read(new File("rsc/toilet2.png"));
			// ToiletPaper
			iToiletPaper = ImageIO.read(new File("rsc/toiletPaper.png"));
			// Plunger
			iPlunger = ImageIO.read(new File("rsc/plunger.png"));
			// Sponge
			iSponge = ImageIO.read(new File("rsc/sponge.png"));
			// HomeBackground
			iHomeBackground = ImageIO.read(new File("rsc/homeBackground.png"));
			// pauseBackground
			iPauseBackground = ImageIO.read(new File("rsc/pauseBackground.png"));
			// Background
			iGameOverBackground = ImageIO.read(new File("rsc/gameOverBackground.png"));
			// Background
			iStopWatch = ImageIO.read(new File("rsc/stopWatch.png"));
			// iJumpscare
			iJumpscare = ImageIO.read(new File("rsc/jumpscare.png"));

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden.");
		}

	}
	
	public static void resetGame() {
		
		AudioManager.startBackgroundMusic();
		Random rnd;
		rnd = new Random();
		
		// Player
		playerX = 400;
		playerY = 450;
		playerSpeedLeft = 7;
		playerSpeedRight = 7;
		playerMoveLeft = false;
		playerMoveRight = false;
		score = 0;
		level = 0;
		time = 0;
		difficultyChangerCounter = 0;

		// Shit
		//numberOfShit = 2;
		shitDistance = 300;
		shitX = new int[Var.numberOfShit];
		shitY = new int[Var.numberOfShit];
		shitSpeed = new int[Var.numberOfShit];
		
		for(int i = 0; i < Var.numberOfShit; i++) {
			Var.shitSpeed[i] = 3; //rnd.nextInt(2) + 3;
		}
		for(int i = 0; i < Var.numberOfShit; i++) {
			Var.shitX[i] = rnd.nextInt(700);
		}
		for(int i = 0; i < Var.numberOfShit; i++) {
			Var.shitY[i] = Var.screenHeight + 110;
		}
		
		/*
		 for(int i = 0; i < Var.numberOfShit; i++) {
			Var.shitY[i] = - 100 - (i * 400);
		}
		 */

		// ShitBackground
		shitBackgroundSpeed = 30;
		shitBackgroundXSpeed = 2;
		shitBackgroundY = Var.screenHeight/* - Var.shitBackgroundSpeed*/;
	}

}
