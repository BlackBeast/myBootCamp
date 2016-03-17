package com.bootcamp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Job Of Coin test is to test all methods of coins.
 */
public class CoinTest {
    @Test
    public void flipCoin_should_return_chance_of_getting_tails() throws Exception {
        Coin coin = new Coin();
        Assert.assertEquals(coin.flipCoin(),0.5);

    }
}