package org.whrhs.dlamson.csa.u5.pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle{
  // common across class
  public static final int WIDTH = 15;
  public static final int HEIGHT = 50;
  // attributes (state)
  private int x;
  private int y;
  private int score;
  private int speed;
  private boolean computerControlled;
  private Color color;


  // constructor(s)
  // no return type and name uppercase and matches the classname
  public Paddle(){
    x = GamePanel.X_GAP;
    y = GamePanel.HEIGHT/2 - Paddle.HEIGHT/2;
    score = 0;
    speed = 5;
    computerControlled = true;
    color = new Color(255, 255, 255);
  }

  public Paddle(Color color){
    // parameters are local variables!!!
    x = GamePanel.X_GAP;
    y = GamePanel.HEIGHT/2 - Paddle.HEIGHT/2;
    score = 0;
    speed = 5;
    computerControlled = true;
    // "this" refers to the attribute color not the parameter
    this.color = color;
  }

  public Paddle(boolean computerControlled){
    if(computerControlled){
      x = GamePanel.X_GAP;
    } else{
      x = GamePanel.WIDTH - GamePanel.X_GAP - Paddle.WIDTH;
    }

    y = GamePanel.HEIGHT/2 - Paddle.HEIGHT/2;
    score = 0;
    speed = 5;
    this.computerControlled = computerControlled;
    color = new Color(255, 255, 255);
  }

  public Paddle(boolean computerControlled, Color color){
    if(computerControlled){
      x = GamePanel.X_GAP;
    } else{
      x = GamePanel.WIDTH - GamePanel.X_GAP - Paddle.WIDTH;
    }

    y = GamePanel.HEIGHT/2 - Paddle.HEIGHT/2;
    score = 0;
    speed = 5;
    this.computerControlled = computerControlled;
    this.color = color;
  }
  
  // methods (behavior)
  public void draw(Graphics g) {
	  g.setColor(this.color);
	  g.fillRect(this.x, this.y, WIDTH, HEIGHT);
  }
 
  
}

