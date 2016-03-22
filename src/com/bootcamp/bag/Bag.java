package com.bootcamp.bag;/*
 * Job Of bag is to hold the magic balls.
 */

import com.bootcamp.exceptions.BagSizeExceededException;
import com.bootcamp.exceptions.InvalidSizeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bag {
    private List<Ball> bag;
    private int capacity;
    private static HashMap<String, Integer> ballList = new HashMap<>();

    private Bag(int capacity) {
        ArrayList<ColorOfBall> colorOfBalls = new ArrayList<>(10);
        this.capacity = capacity;
        this.bag = new ArrayList<>();
    }

    public static Bag create(int bagSize) throws InvalidSizeException {
        if (bagSize < 1 || bagSize > 12) {
            throw new InvalidSizeException(bagSize);
        }
        return new Bag(bagSize);
    }

    public boolean isBagCreated() {
        return this.bag.size() < capacity;
    }

    public void putBall(Ball colorOfBall) throws IndexOutOfBoundsException, BagSizeExceededException {
        if (canWeAddBall(colorOfBall)) {
            bag.add(colorOfBall);
        } else
            throw new IndexOutOfBoundsException("colorOfBall can't be added");
    }

    private boolean canWeAddBall(Ball ball) throws BagSizeExceededException {
        boolean result = false;
        boolean ballPresent = isBallPresent(ball);
        HashMap<String, Integer> ballList = ballCount();
        if (!isBagFull()) {
            if (ballList.get("GREEN") < 3 && ball.isOfColor(ColorOfBall.GREEN)) {
                result = true;
            }

            if (ballList.get("RED") < (ballList.get("GREEN") * 2) - 1 && ball.isOfColor(ColorOfBall.RED)) {
                result = true;
            }

            if(ballList.get("BLUE") <= bag.size() && ball.isOfColor(ColorOfBall.BLUE)) {
                result = true;
            }
        }
        else
            throw new BagSizeExceededException();
        return result;
    }

    private HashMap<String, Integer> ballCount() {
        int redCount = 0;
        int greenCount = 0;
        int blueCount = 0;
        HashMap<String, Integer> ballList = new HashMap<>();
        ColorOfBall[] enumConstants = ColorOfBall.class.getEnumConstants();
        for (ColorOfBall enumConstant : enumConstants) {
            ballList.put(enumConstant.name(), 0);
        }
        for (Ball ball : this.bag) {
            if (ball.isOfColor(ColorOfBall.GREEN)) {
                greenCount++;
                ballList.put(ball.getColor().name(), greenCount);
            } else if (ball.isOfColor(ColorOfBall.RED)) {
                redCount++;
                ballList.put(ball.getColor().name(), redCount);
            } else {
                blueCount++;
                ballList.put(ball.getColor().name(), blueCount);
            }
        }
        return ballList;
    }

    private boolean isBallPresent(Ball colorOfBall) {
        return this.bag.contains(colorOfBall);
    }

    public int totalBallsInBag() {
        return this.bag.size();
    }

    public boolean isBagFull() {
        return bag.size() == capacity;
    }
}
