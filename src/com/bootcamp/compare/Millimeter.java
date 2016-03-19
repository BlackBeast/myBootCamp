package com.bootcamp.compare;/*
 * Job Of 
 */

public class Millimeter implements Units {
    private double value;

    public Millimeter(double value) {
        this.value = value;
    }

    @Override
    public double convertToStandardUnit() {
        return value * 0.04;

    }
}
