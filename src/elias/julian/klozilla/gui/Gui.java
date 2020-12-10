package elias.julian.klozilla.gui;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import elias.julian.klozilla.gamehandler.KeyHandler;
import elias.julian.klozilla.main.Var;

public class Gui {

	public Gui() {


		
		Var.JFGame = new JFrame();
		Var.JFGame.setSize(Var.screenWidth, Var.screenHeight);
		Var.JFGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.JFGame.setLocationRelativeTo(null);
		Var.JFGame.setLayout(null);
		Var.JFGame.setTitle("KloZilla - by Elias and Julian");
		Var.JFGame.setResizable(false);
		Var.JFGame.addKeyListener(new KeyHandler());
		Var.JFGame.requestFocus();
		Var.JFGame.setVisible(true);

		Var.label = new Label();
		Var.label.setBounds(0, 0, Var.screenWidth, Var.screenHeight);
		Var.label.setVisible(true);
		Var.JFGame.add(Var.label);

	}
}
