package com.bootcamp;/*
 * Job Of Coin is to contain all behaviours of a coin.
 */

public class Coin {
    private final String head;
    private final String tail;

    public Coin() {
        this.head = "head";
        this.tail = "tail";
    }

    public double flipCoin(){
        return 1/2;
    }
}
