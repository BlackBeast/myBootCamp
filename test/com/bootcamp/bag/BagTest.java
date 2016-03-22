package com.bootcamp.bag;

import com.bootcamp.exceptions.BagSizeExceededException;
import com.bootcamp.exceptions.InvalidSizeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void should_be_able_to_hold_a_maximum_of_12_balls() throws InvalidSizeException {
        thrown.expect(InvalidSizeException.class);
        thrown.expectMessage("expected bag size between 0 to 12 but found 13");
        Bag.create(13);
    }

    @Test
    public void should_be_able_to_create_a_bag_of_maximum_of_12_balls() throws InvalidSizeException {
        Bag bag = Bag.create(12);
        boolean bagCreated = bag.isBagCreated();
        assertEquals(bagCreated,true);
    }

    @Test
    public void should_only_allow_to_store_only_maximum_of_three_green_balls() throws InvalidSizeException, BagSizeExceededException {
        Bag bag = Bag.create(12);
        Ball greenBall = new Ball(ColorOfBall.GREEN);
        bag.putBall(greenBall);
        bag.putBall(greenBall);
        bag.putBall(greenBall);
        assertEquals(3,bag.totalBallsInBag());
    }

    @Test
    public void should_only_allow_to_store_only_1_green_ball_and_1_red_ball() throws InvalidSizeException, BagSizeExceededException {
        Bag bag = Bag.create(12);
        Ball greenBall = new Ball(ColorOfBall.GREEN);
        Ball redBall = new Ball(ColorOfBall.RED);
        bag.putBall(greenBall);
        bag.putBall(redBall);
        assertEquals(2,bag.totalBallsInBag());
    }

    @Test
    public void should_throw_an_exception_if_ball_rules_are_not_satisfied() throws InvalidSizeException, BagSizeExceededException {
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("colorOfBall can't be added");
        Bag bag = Bag.create(12);
        Ball greenBall = new Ball(ColorOfBall.GREEN);
        Ball redBall = new Ball(ColorOfBall.RED);
        bag.putBall(greenBall);
        bag.putBall(redBall);
        bag.putBall(redBall);
    }

    @Test
    public void should_throw_an_exception_if_the_bag_is_full() throws InvalidSizeException, BagSizeExceededException {
        thrown.expect(BagSizeExceededException.class);
        thrown.expectMessage("Bag Size Exceeded. You can't add more");
        Bag bag = Bag.create(3);
        Ball ball = new Ball(ColorOfBall.GREEN);
        bag.putBall(ball);
        bag.putBall(ball);
        bag.putBall(ball);
        bag.putBall(ball);
    }

    @Test
    public void should_hold_as_many_blue_balls_as_per_the_bag_size() throws InvalidSizeException, BagSizeExceededException {
        Bag bag = Bag.create(3);
        Ball ball = new Ball(ColorOfBall.BLUE);
        bag.putBall(ball);
        bag.putBall(ball);
        bag.putBall(ball);
        assertEquals(3,bag.totalBallsInBag());
    }

    @Test
    public void should_create_a_bag_with_7_size_with_2_green_3_red_and_2_blue_balls() throws BagSizeExceededException, InvalidSizeException {
        Bag bag = Bag.create(7);
        Ball blueBall = new Ball(ColorOfBall.BLUE);
        Ball greenBall = new Ball(ColorOfBall.GREEN);
        Ball redBall = new Ball(ColorOfBall.RED);
        bag.putBall(greenBall);
        bag.putBall(greenBall);
        bag.putBall(redBall);
        bag.putBall(redBall);
        bag.putBall(redBall);
        bag.putBall(blueBall);
        bag.putBall(blueBall);
        assertEquals(7,bag.totalBallsInBag());
    }

    @Test
    public void should_not_put_red_ball_if_there_is_no_green_ball() throws BagSizeExceededException, InvalidSizeException {
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("colorOfBall can't be added");
        Bag bag = Bag.create(7);
        Ball redBall = new Ball(ColorOfBall.RED);
        bag.putBall(redBall);
    }
}