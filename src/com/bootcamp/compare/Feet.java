package com.bootcamp.compare;/*
 * Job Of 
 */

public class Feet implements Units {
    private double value;

    public Feet(double value) {
        this.value = value;
    }

    @Override
    public double convertToStandardUnit() {
        return 12 * value;

    }
}
