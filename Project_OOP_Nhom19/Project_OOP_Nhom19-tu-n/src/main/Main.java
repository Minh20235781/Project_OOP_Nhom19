package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

    public static JFrame window;
	
	public static void main(String[] args) {
		
		window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Isekai Huster");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		// STARTING GAME

		gamePanel.startGameThread();

	}
    public void setIcon() {
    	
    	ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("player_huster/run_down_40x40_1.png"));
    	window.setIconImage(icon.getImage());
    }
}
