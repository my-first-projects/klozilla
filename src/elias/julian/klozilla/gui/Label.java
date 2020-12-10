package elias.julian.klozilla.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;

public class Label extends JLabel {
	
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.BLACK);

		if (Var.gameState == GameState.GAME) {
			
			
			/*if(!Var.isLoaded) {
				new LoadingGui();
				Var.isLoaded = true;
			} else {*/
			
				// Background
				//g.drawImage(Var.iBackground, 0, 0, Var.screenWidth, Var.screenHeight, null);
				g.drawImage(Var.iBackground, 0, 0, Var.screenWidth, Var.screenHeight, null);
				
	
				// shitBackground
				g.drawImage(Var.iShitBackground1, Var.shitBackgroundX1, Var.shitBackgroundY, Var.screenWidth,
						Var.screenHeight + 200, null);
				g.drawImage(Var.iShitBackground2, Var.shitBackgroundX2, Var.shitBackgroundY, Var.screenWidth,
						Var.screenHeight + 200, null);
	
				// Toilet
				if (Var.playerMoveLeft) {
					Var.lastDirection = 2;
				} else if (Var.playerMoveRight) {
					Var.lastDirection = 1;
				}
				if (Var.lastDirection == 1) {
					g.drawImage(Var.iToilet1, Var.playerX, Var.playerY, 100, 100, null);
				} else if (Var.lastDirection == 2) {
					g.drawImage(Var.iToilet2, Var.playerX, Var.playerY, 100, 100, null);
				}
	
				// Plunger
				g.drawImage(Var.iPlunger, Var.plungerX, Var.plungerY, 100, 100, null);
	
				// Sponge
				g.drawImage(Var.iSponge, Var.spongeX, Var.spongeY, 100, 100, null);
	
				// ToiletPaper
				g.drawImage(Var.iToiletPaper, Var.toiletPaperX, Var.toiletPaperY, 100, 100, null);
	
				// StopWatch
				g.drawImage(Var.iStopWatch, Var.stopWatchX, Var.stopWatchY, 100, 100, null);
	
				// Shit
				for (int i = 0; i < Var.numberOfShit; i++) {
					g.drawImage(Var.iShit[i], Var.shitX[i], Var.shitY[i], 100, 100, null);
				}
	
				// Timer
				g.drawString("Time: " + Var.time, Var.screenWidth - 70, 30);
	
				// Level
				g.drawString("Level: " + Var.level, Var.screenWidth - 70, 45);
	
				// Score
				g.drawString("Score: " + Var.score, 30, 30);
	
				// highScore
				g.drawString("Highscore: " + Var.highScore, 30, 45);
			//}
		} else if (Var.gameState == GameState.START) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			g.drawImage(Var.iHomeBackground, 0, 0, Var.screenWidth, Var.screenHeight, null);
			//g.drawImage(Var.iLoading, 0, 0, 600, 800, this);
			// highScore
			g.drawString("Highscore: " + Var.highScore, 30, 45);
		} else if (Var.gameState == GameState.PAUSE) {
			// Background
			g.drawImage(Var.iBackground, 0, 0, Var.screenWidth, Var.screenHeight, null);
			// shitBackground
			g.drawImage(Var.iShitBackground1, 0, Var.shitBackgroundY, Var.shitBackgroundX1, Var.screenHeight + 200,
					null);
			g.drawImage(Var.iShitBackground2, 0, Var.shitBackgroundY, Var.shitBackgroundX2, Var.screenHeight + 200,
					null);

			// Toilet
			if (Var.playerMoveLeft) {
				g.drawImage(Var.iToilet1, Var.playerX, Var.playerY, 100, 100, null);
			} else if (Var.playerMoveRight) {
				g.drawImage(Var.iToilet2, Var.playerX, Var.playerY, 100, 100, null);
			}
			// Shit
			for (int i = 0; i < Var.numberOfShit; i++) {
				g.drawImage(Var.iShit[i], Var.shitX[i], Var.shitY[i], 100, 100, null);
			}
			// Score

			g.drawString("Score: " + Var.score, 30, 30);

			g.drawString("Highscore: " + Var.highScore, 30, 45);

			// Timer

			g.drawString("Time: " + Var.time, Var.screenWidth - 70, 30);
			// Level

			g.drawString("Level: " + Var.level, Var.screenWidth - 70, 45);
			// Score

			g.drawString("Score: " + Var.score, 30, 30);

			// highScore

			g.drawString("Highscore: " + Var.highScore, 30, 45);

			// pauseBackground
			g.drawImage(Var.iPauseBackground, 0, 0, Var.screenWidth, Var.screenHeight, null);
		} else if (Var.gameState == GameState.GAME_OVER) {

			// Background
			g.drawImage(Var.iBackground, 0, 0, Var.screenWidth, Var.screenHeight, null);
			// shitBackground
			g.drawImage(Var.iShitBackground1, Var.shitBackgroundX1, Var.shitBackgroundY, Var.screenWidth,
					Var.screenHeight + 200, null);
			g.drawImage(Var.iShitBackground2, Var.shitBackgroundX2, Var.shitBackgroundY, Var.screenWidth,
					Var.screenHeight + 200, null);

			// Toilet
			if (Var.playerMoveLeft) {
				g.drawImage(Var.iToilet1, Var.playerX, Var.playerY, 100, 100, null);
			} else if (Var.playerMoveRight) {
				g.drawImage(Var.iToilet2, Var.playerX, Var.playerY, 100, 100, null);
			}
			// Shit
			for (int i = 0; i < Var.numberOfShit; i++) {
				g.drawImage(Var.iShit[i], Var.shitX[i], Var.shitY[i], 100, 100, null);
			}
			// Score

			g.drawString("Score: " + Var.score, 30, 30);

			g.drawString("Highscore: " + Var.highScore, 30, 45);

			// Timer

			g.drawString("Time: " + Var.time, Var.screenWidth - 70, 30);
			// Level

			g.drawString("Level: " + Var.level, Var.screenWidth - 70, 45);
			// Score

			g.drawString("Score: " + Var.score, 30, 30);

			// highScore

			g.drawString("Highscore: " + Var.highScore, 30, 45);

			// GameOver-Background
			g.drawImage(Var.iGameOverBackground, 0, 0, Var.screenWidth, Var.screenHeight, null);
		} else if(Var.gameState == GameState.LOADING) {
			//new LoadingGui();
			g.drawImage(Var.iLoading, 0, 0, Var.screenWidth, Var.screenHeight, null);
			
			Var.isLoaded = true;
			Var.gameState = GameState.START;

			try {
				Thread.sleep(3500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(Var.gameState == GameState.JUMPSCARE) {
			g.drawImage(Var.iJumpscare, 0, 0, 800, 600, null);
		}

		repaint();
	}

}