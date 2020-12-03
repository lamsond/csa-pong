# Pong Part 2

## Goal

Get the initial Pong game panel to display

## Starting Point

At this point you should have something similar to this. Remember, you can use your own colors and paddle sizes. If you have errors, compare your code to the files in the `src` folder of this repo.  

![sofarsogood](https://i.imgur.com/Tn6FbYF.png)

## TODO

1. **Write a `public void draw(Graphics g)` method for the `Ball` class:** This is going to be almost identical to the method in the `Paddle` class. How will it be different?
2. **Call this method from inside `paintComponent(Graphics g)` in the `GamePanel` class:** Do you see the ball now? You should!
3. **Familiarize yourself with what a `getter` method is:** Our attributes are kept `private` to follow best encapsulation practices. Therefore we must write a `public` getter method for any values an external class needs access to. Getter methods are very simple to write. The return type is always the data-type you are accessing, we name them `get` followed by the name of the attribute we accessing, and they take no parameters. The definition usually contains a return statement only. See the example below for an attribute called `name`:  

  ```java
  private String name;
  
  /* other attributes and constructors not shown */
  
  // getter method
  public String getName(){
    return name;
  }
  ```
4. **Write getter methods `getComputerControlled()`, `getColor()`, and `getScore()` in the `Paddle` class:** Feel free to write getter methods for all your attributes, but these are the only ones you need today.
5. **Fix the Scoreboard constructor:** Right now our scoreboard constructor is hard-coding the x and y coordinates to somewhere in the upper leftside of the board. Using the getter you wrote in step #4, position the scoreboard on the left side of board if it is a computer controlled paddle, and on the right if it is not.
6. **Write a `public void draw(Graphics g)` method for the Scoreboard:** Use the `getColor()` method you wrote earlier to set the color of your graphics. In other words, the scoreboard color should match the color of the paddle. Use `g.setFont(FONT)` to set your font. Use `g.drawString()` to draw the scoreboard text to the screen. The `drawString()` method takes three parameters 1) The text String you want to print (this should be a String version of the paddle's score) 2) x coordinate and 3) y coordinate.
7. **Call this method from inside `paintComponent(Graphics g)` in the `GamePanel` class:** Do you see both scores now? Are they `0`? They should be! 
8. **Improve and customize:** Chances are things aren't exactly how you pictured them. Adjust the colors, sizes, and positioning to your liking. See if you are able to get a dashed line down the middle. Add any other features you like.


