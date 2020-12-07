package org.whrhs.dlamson.csa.u5.pong;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	public Main() {
		setSize(GamePanel.WIDTH+20, GamePanel.HEIGHT+20);
		setTitle("CSA Pong!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel pongBoard = new GamePanel();
		add(pongBoard);
	}
	
	public static void main(String[] args) {
		// test things here
		Main game = new Main();
		game.setVisible(true);
    
	}
}
