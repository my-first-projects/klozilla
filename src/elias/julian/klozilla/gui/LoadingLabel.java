package elias.julian.klozilla.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

import elias.julian.klozilla.gamehandler.GameState;
import elias.julian.klozilla.main.Var;

public class LoadingLabel extends JLabel {
	
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		////g.drawImage(Var.iLoading, 0, 0, Var.screenWidth, Var.screenHeight, null);
		repaint();
	}

}