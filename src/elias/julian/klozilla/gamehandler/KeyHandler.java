package elias.julian.klozilla.gamehandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import elias.julian.klozilla.gui.Gui;
import elias.julian.klozilla.gui.LoadingGui;
import elias.julian.klozilla.main.Var;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			Var.playerMoveLeft = true;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			Var.playerMoveRight = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			
			if(Var.gameState == GameState.START) {
				System.out.println("Game started");
				Var.resetGame();
				Var.gameState = GameState.GAME;
			} else if (Var.gameState == GameState.GAME_OVER) {
				System.out.println("Game restarted");
				Var.resetGame();
				Var.gameState = GameState.GAME;
			} else if (Var.gameState == GameState.PAUSE) {
				System.out.println("Game restarted");
				Var.resetGame();
				Var.gameState = GameState.GAME;
			}
			
			/*if(!Var.isLoaded) {
				new LoadingGui();
				Var.isLoaded = true;
			}*/
		}
		
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			if(Var.gameState == GameState.PAUSE) {
				System.out.println("Game continued");
				Var.gameState = GameState.GAME;
			}else if(Var.gameState == GameState.GAME){
				System.out.println("Game paused");
				Var.gameState = GameState.PAUSE;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			Var.playerMoveLeft = false;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			Var.playerMoveRight = false;
		}
		
		

	}

	@Override // Start
	public void keyTyped(KeyEvent e) {
		
	}

}
