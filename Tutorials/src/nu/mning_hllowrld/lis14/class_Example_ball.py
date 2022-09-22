# -*- coding: utf-8 -*-
# Hello World - Second Edition by Warren & Carter Sande
# Listing 14.2 Using the Ball class
# 

class Ball():
    
    def __init__(self, color, size, direction):
        self.color = color
        self.size = size
        self.direction = direction
    
    def bounce(self):
        if self.direction == "down":
            self.direction = "up"

#myBall = Ball()
#myBall.direction = "down"
#myBall.color = "red"
#myBall.size = "small"
myBall = Ball("red", "small", "down")

print("I just created a ball.")
print("My ball is", myBall.size)
print("My ball is", myBall.color)
print("My ball's direction is", myBall.direction)
print("Now I'm going to bounce the ball")
print()

myBall.bounce()
print("Now the ball's direction is", myBall.direction)


