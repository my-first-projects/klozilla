package elias.julian.klozilla.gui;

import javax.swing.JFrame;

import elias.julian.klozilla.gamehandler.KeyHandler;
import elias.julian.klozilla.main.Var;

public class LoadingGui {

	public LoadingGui() {
	
		Var.JFLoading = new JFrame();
		Var.JFLoading.setSize(Var.screenWidth, Var.screenHeight);
		Var.JFLoading.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.JFLoading.setLocationRelativeTo(null);
		Var.JFLoading.setLayout(null);
		Var.JFLoading.setTitle("--> KloZilla - by Elias and Julian");
		Var.JFLoading.setResizable(false);
		Var.JFLoading.addKeyListener(new KeyHandler());
		Var.JFLoading.requestFocus();
		Var.JFLoading.setVisible(true);
	
		Var.loadingLabel = new Label();
		Var.loadingLabel.setBounds(0, 0, Var.screenWidth, Var.screenHeight);
		Var.loadingLabel.setVisible(true);
		Var.JFLoading.add(Var.loadingLabel);
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		
		Var.JFLoading.setVisible(false);
		
	}
	
}
