package org.whrhs.dlamson.csa.u5.pong;

import java.awt.Font;
import java.awt.Graphics;

public class Scoreboard {

  public static final Font FONT = new Font("SansSerif", Font.BOLD, 72);
  
  private int x, y;
  private Paddle paddle;
  
  public Scoreboard(Paddle paddle) {
	  this.paddle = paddle;
	  if(paddle.getComputerControlled()) {
		  x = 200;
	  } else {
		  x = 500;
	  }
	  y = 70;

  }
  
  // methods
  public void draw(Graphics g) {
	  g.setColor(paddle.getColor());
	  g.setFont(FONT);
	  g.drawString(paddle.getScore()+"", this.x, this.y);
  }
  

	
}
