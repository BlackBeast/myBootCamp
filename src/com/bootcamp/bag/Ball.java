package com.bootcamp.bag;/*
 * Job Of Ball is to have the properties of ball.
 */

public class Ball {
    private ColorOfBall color;

    public Ball(ColorOfBall color) {
        this.color = color;
    }

    public boolean isOfColor(ColorOfBall anotherColor){
        return this.color == anotherColor;
    }

    public ColorOfBall getColor(){
        return this.color;
    }
}
