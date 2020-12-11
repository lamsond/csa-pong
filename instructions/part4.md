# Pong Part 4

## Goals

1. Get the ball to bounce off the paddles (**minimum:** works for horizontal paths 0 and 180 deg, **challenge:** works for all angles of impact (see [law of reflection](https://en.wikipedia.org/wiki/Reflection_(physics))
 
2. Start keeping track of the score if the ball goes past the moving paddle.

3. Reset the ball to the middle of the board after a point is scored.

## Things we are not worrying about yet
but you may if you get done early :)

1. Moving the right paddle with the keyboard.

2. Reflecting off the top and bottom lines

3. Improving the left paddle strategy

4. My 90 degree theta bug (In my code, it is still possible to generate a random path that is vertical. How can we fix this?)

## Starting Point

At this point you should have a left paddle that repeatedly moves up and down and a right paddle that is stationary. The ball should take off on a random path.

## TODO

### Write a `checkPaddleCollision()` instance method in the Game Panel class

To get started we will consider an simple case, when the ball is traveling horizontally, at zero degrees. Use one of your constructors that allows you hard code the theta
value, instead of one that randomizes for now. This method must examine the coordinates of the ball and the paddles and check several inequalities to determine if and how
to change the theta value. At a minimum, this method should work for 0 and 180 degrees. If you finish early, see if you can program it so it works for any theta. 
Take a look at the [law of reflection](https://en.wikipedia.org/wiki/Reflection_(physics)) to understand the geometry of this. NOTE: you made need to add some getters
and setters to your `Paddle` and `Ball` classes to get this to work.

### Write an updateScore() instance method in the Game Panel class

At what point can we conclude that the ball has gotten past the paddle and a player has scored? Write a method that checks if this event has occured and update the 
appropriate paddle's score accordingly.

### Write a reset() instance method in the Game Panel class.

This method should return the ball to the middle of the board after a scoring event.

### Call these methods

The `checkPaddleCollision()` method and `updateScore()` should be called in the `actionPerformed()` method (This is what runs every frame). The reset() method should be called
condtionally based on a scoring event, either within `actionPerformed()` or `updateScore()`, your choice. 
