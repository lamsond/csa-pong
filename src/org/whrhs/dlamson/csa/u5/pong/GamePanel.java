package org.whrhs.dlamson.csa.u5.pong;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class GamePanel extends JPanel{
  // use this class to store constants about the Pong gameboard dimensions.
  public static final int WIDTH = 720;
  public static final int HEIGHT = 600;
  public static final int X_GAP = 50;
  
  // colors
  public static final Color LP_CLR = new Color(24, 30, 200);
  public static final Color RP_CLR = new Color(27, 27, 27);
  public static final Color B_CLR = new Color(25, 72, 135);
  
  // attributes
  private Paddle leftPaddle, rightPaddle;
  private Scoreboard leftScoreboard, rightScoreboard;
  private Ball ball;
  
  // constructor
  public GamePanel() {
	  setSize(new Dimension(WIDTH, HEIGHT));
	  leftPaddle = new Paddle(true, LP_CLR);
	  rightPaddle = new Paddle(false, RP_CLR);
	  leftScoreboard = new Scoreboard(leftPaddle);
	  rightScoreboard = new Scoreboard(rightPaddle);
	  ball = new Ball(B_CLR);
  }
  
  @Override
  public void paintComponent(Graphics g) {
	  leftPaddle.draw(g);
	  rightPaddle.draw(g);
  }
}

