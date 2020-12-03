package org.whrhs.dlamson.csa.u5.pong;

import java.awt.Font;

public class Scoreboard {

  public static final Font FONT = new Font("SansSerif", Font.BOLD, 36);
  
  private int x, y;
  private Paddle paddle;
  
  public Scoreboard(Paddle paddle) {
	  this.paddle = paddle;
	  x = 150;
	  y = 75;
  }

	
}
