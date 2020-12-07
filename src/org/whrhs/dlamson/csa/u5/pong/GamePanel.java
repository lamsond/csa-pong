package org.whrhs.dlamson.csa.u5.pong;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel{
  // use this class to store constants about the Pong gameboard dimensions.
  public static final int WIDTH = 720;
  public static final int HEIGHT = 600;
  public static final int X_GAP = 50;
  public static final int Y_GAP = 20;
  public static final int DASH_LEN = 18;
  
  // colors
  public static final Color LP_CLR = new Color(0xf72585);
  public static final Color RP_CLR = new Color(0x4cc9f0);
  public static final Color B_CLR = new Color(0xb5179e);
  public static final Color BG_CLR = new Color(0x3a0ca3);
  public static final Color LINE_CLR = new Color(0x4361ee);
  
  // attributes
  private Paddle leftPaddle, rightPaddle;
  private Scoreboard leftScoreboard, rightScoreboard;
  private Ball ball;
  
  // constructor
  public GamePanel() {
	  setSize(WIDTH, HEIGHT);
	  setBackground(BG_CLR);
	  leftPaddle = new Paddle(true, LP_CLR);
	  rightPaddle = new Paddle(false, RP_CLR);
	  leftScoreboard = new Scoreboard(leftPaddle);
	  rightScoreboard = new Scoreboard(rightPaddle);
	  ball = new Ball(B_CLR);
  }
  
  @Override
  public void paintComponent(Graphics g) {
	  super.paintComponent(g);
	  drawBackground(g);
	  leftPaddle.draw(g);
	  rightPaddle.draw(g);
	  ball.draw(g);
	  leftScoreboard.draw(g);
	  rightScoreboard.draw(g);
  }
  
  private void drawBackground(Graphics g) {
	  g.setColor(LINE_CLR);
	  for(int y = Y_GAP; y < HEIGHT; y += 2*DASH_LEN) {
		  g.drawLine(WIDTH/2, y, WIDTH/2, y+20);
	  }
  }
}

