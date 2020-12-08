# Pong Part 3

## Goals

**NOTE:** There is a video posted to Classroom, that walks through all of this. Parts of this get a little tricky.  

1. Write a `setScore()` method in the `Paddle` class.
 
2. Start writing a `move()` instance method in the `Paddle` class for a computer controlled paddle.

3. Start writing a `move()` instance method in the `Ball` class. We won't be dealing with reflections yet.

3. Set up the basic animation cycle

## Starting Point

At this point you should have something similar to this, the dashed line and background color are optional.  

![completed part 2](https://i.imgur.com/yrQ6dpL.png)

## TODO

### Write the `setScore()` method

This can be a basic setter method. Takes in an integer, sets the score to the value passed, and returns nothing.

### Start writing the `move()` method in the Paddle class

This method will be called each time the panel image is refreshed. For today, we will be coding some *not so intelligent* logic for the computer controlled paddle. We'll make the computer's paddle move mindlessly up and down over and over regardless of the position of the ball. We can improve the logic later, but for now let's just make sure we can animate something. To get started, set up the following instance method:  

```java
public void move(){
	if(computerControlled){
		// TODO: write paddle logic here
	} else{
	   // player logic - do later
	}
}
```

Then implement the following logic: 1) Increment the paddle y coordinate by it's speed. 2) Check to see if the bottom of the paddle has reached/exceeded the bottom of the panel (speed is +) OR if the top of the paddle has reached/exceeded the top of the paddle. (speed is -) 3) If either of these two events happened, multiply the speed by -1. This will change the direction of the paddle.

### start writing the `move()` method for the `Ball` class.

You've already set-up the logic to generate a random theta value for the ball to travel along. So how do we use that to update our `x` and `y` coordinates? Trigonometry! Math really is useful :)  

![triggy](https://i.imgur.com/AUEeVhO.png)

Notice, the y value is negative due to the coordinate system we use in Graphics. So all we will do for now in the move method is increment x by `speed*cos(theta)` and y by `-speed*sin(theta)`. You may use the static methods `Math.sin()` and `Math.cos()` to calculate these, just note they expect an input in **radians**. Fortunately there is another method called `Math.toRadians()` that can be chained together to convert this for us. Don't worry about reflections yet, we'll just let the ball travel off the screen for now.

### Setting up the Animation Cycle

1. Add the following imports to `GamePanel.java`

```java
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
```

**Why?** We will be using a `Timer` instance to repeatedly countdown a fixed amount of milliseconds. When the timer reaches zero, an `ActionEvent` is generated. We will use the `ActionListener` to listen for that event to happen. When the `ActionEvent` occurs, we will move the objects on the screen and repaint() the screen. This cycle will repeat over and over resulting in an animation.

2. To set our `GamePanel` up so it can *hear* events, we have to implement `ActionListener`. Modify the class signature as shown below

```java
public class GamePanel extends JPanel implements ActionListener{
```

Saying that we are *implementing* ActionListener, is a way of telling Java that we will be including a very specific method in our class called `actionPerformed()`. This method tells the computer what to do when an `ActionEvent` (timer countdown) occurs. We write this in step 5.

3. Declare a timer instance variable as one of class attributes

```java
private Timer timer;
```

4. Create the timer and start it inside the constructor

```java
// at the end of the constructor
timer = new Timer(30, this);
timer.start();
```

The `30` means that the time will count 30ms before generating the ActionEvent. The `this` means that it will be actively listening the GamePanel being created in the constructor.

5.  Write the `actionPerformed()` method

```java
@Override
public void actionPerformed(ActionEvent e){
	leftPaddle.move();
	ball.move();
	repaint();
}
```

This method will be triggered automatically any time an ActionEvent occurs. In this case, the ActionEvent occurs whenever 30ms goes by. We want to move the leftPaddle and the ball. After we move them, we call the `repaint()` command (inherited) which causes the panel to refresh.

At this point you should see the paddle moving up and the ball moving in a random direction. Run the program multiple times to confirm the ball follows different paths. 
