package com.bootcamp.compare;/*
 * Job Of 
 */

public class Centimeter implements Units {
    private double value;

    public Centimeter(double value) {
        this.value = value;
    }


    @Override
    public double convertToStandardUnit() {
        return value * 0.4;
    }
}
