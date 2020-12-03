package org.whrhs.dlamson.csa.u5.pong;

import java.awt.Color;

public class Ball {
	
	public static final int SIZE = 10;
	
	private int x, y, speed, theta;
	private Color color;
	
	public Ball() {
		x = GamePanel.WIDTH/2 - SIZE/2;
		y = GamePanel.HEIGHT/2 - SIZE/2;
		speed = 3;
		theta = generateThetaValue();
		color = new Color(255, 255, 255);
	}
	
	public Ball(Color color) {
		x = GamePanel.WIDTH/2 - SIZE/2;
		y = GamePanel.HEIGHT/2 - SIZE/2;
		speed = 3;
		theta = generateThetaValue();
		this.color = color;
	}
	
	public Ball(int theta) {
		x = GamePanel.WIDTH/2 - SIZE/2;
		y = GamePanel.HEIGHT/2 - SIZE/2;
		speed = 3;
		this.theta = theta % 360;
		color = new Color(255, 255, 255);
	}
	
	public Ball(int theta, Color color) {
		x = GamePanel.WIDTH/2 - SIZE/2;
		y = GamePanel.HEIGHT/2 - SIZE/2;
		speed = 3;
		this.theta = theta % 360;
		this.color = color;
	}
	
	// helper methods can be private
	private static int generateThetaValue() {
		int window = 5;
		int randTheta = 90;
		while(Math.abs(randTheta - 90) < window || Math.abs(randTheta - 270) < window) {
			randTheta = (int)(Math.random() * 360);
			
		}
		return randTheta;
	}

}

