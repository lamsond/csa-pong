# Pong Part 1

## Goal

Today we will work on creating the attributes and constructors for the objects in our Pong game.

## Coordinate System

Our Pong game will exist in a 720px x 600px world as shown below.  

![coords](https://i.imgur.com/Z29l2qw.png)

## Paddle Class - Implement Together

### Attributes - Given

### Constructors

1. **Paddle():** Set the location (top left corner) of the paddle in the left position. Remember to avoid magic numbers in your programs. Declare constants in GamePanel.java to reference the Panel dimensions. Make it computer controlled and give it a speed of 5. Set the color to white and the score to 0.
2. **Paddle(Color color):** Same as above except initialize the color attribute with a parameter.
3. **Paddle(boolean computerControlled):** Initialize the computerControlled attribute with the parameter passed (note proper usage of the `this` keyword). Set the speed to 5. If the parameter is `true`, set the position of the paddle on the left. If it is `false`, set it on the right. Avoid magic numbers. Set the color to white.
4. **Paddle(boolean computerControlled, Color color):** Same as above except initialize the color attribute with a parameter.  

## Ball Class - Implement on your own

### Constant

1. **SIZE:** length of the "ball". In Pong, a *ball* is a square.

### Attributes

1. **x:** integer representing left edge of "ball".
2. **y:** integer representing top edge of "ball".
3. **speed:** speed ball is traveling.
4. **theta:** integer between 0 and 359 inclusive, representing the angle in degrees the ball is moving. `0` = moving directly east, `180` = moving west, etc.
5. **color:** color of the ball.

### Constructors

1. **Ball():** Center the ball in middle of the Panel. *Note:* ball coordinates represent top left corner. We must offset this so the center of the square is in the center of the panel. Avoid magic numbers, declare constants in GamePanel to reference panel dimensions. Randomize the theta value. Avoid values within +/- 5 degrees of 90 and 270. We want to avoid a ball that constantly bounces vertically. Initialize the color to a value of your choice. Set the speed to 3 and the color to white.
2. **Ball(Color color):** Same as above except initialize color attribute with parameter.
3. **Ball(int theta):** Same as first constructor except take the intial theta value from the user. Don't worry about avoiding values close to 270 and 90. Do however, use the mod operator to get values between 0 and 359. For example `Ball(360)` should set the theta attribute to `0`.
4. **Ball(int theta, Color color):** Same as above except initialize the color with a parameter.

## Scoreboard Class - Implement on your own

### Constant

1. **FONT:** font size and instance of your choice. See linked tutorial.[https://www.oreilly.com/library/view/learning-java/1565927184/ch17s06.html](https://www.oreilly.com/library/view/learning-java/1565927184/ch17s06.html)

### Attributes

1. **x:** integer representing left edge of textbox.
2. **y:** integer representing top edge of textbox.
3. **paddle:** a scoreboard will be associated with a paddle instance. We will use this later to set the color and value of the text. 

### Constructor

1. **Scoreboard(Paddle paddle):** Option 1 - initialize these values anywhere for now, set the paddle using the parameter.  
Option 2 - If the paddle belongs to the computer, position the box somewhere in the upper left. (Don't worry about exact positoning for now -- fonts require some trial and error). If not, position it somewhere in the upper right. The challenge here is the attributes of a Paddle instance are `private`, so you will need to write `getter` methods to access these. We will cover this in the next lesson.
