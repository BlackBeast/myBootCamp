package com.bootcamp;

import org.junit.Assert;
import org.junit.Test;


public class ChanceTest {
    @Test
    public void chanceOfGettingShouldGiveTheChanceOfGettingATail() throws Exception {
        Chance coinChance = new Chance(2,1);
        Assert.assertEquals(coinChance.chanceOfGetting(1),.5,.01);
    }
    @Test
    public void chanceOfNotGettingShouldGiveTheChanceOfNotGettingATail() throws Exception {
        Chance coinChance = new Chance(2,1);
        Assert.assertEquals(coinChance.chanceOfNotGetting(1),.5,.01);
    }
    @Test
    public void chanceOfGettingShouldGiveTheChanceOfGettingTwoTailsWithTwoCoins() throws Exception {
        Chance coinChance = new Chance(2,2);
        Assert.assertEquals(coinChance.chanceOfGetting(1),.25,.001);
    }
    @Test
    public void chanceOfGettingShouldNotGiveTheChanceOfNotGettingTwoTailsWithTwoCoins() throws Exception {
        Chance coinChance = new Chance(2,2);
        Assert.assertEquals(coinChance.chanceOfNotGetting(1),.75,.001);
    }
}