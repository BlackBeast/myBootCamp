package com.bootcamp.compare;/*
 * Job Of 
 */

public class Gallon implements Units{
    private double value;

    public Gallon(double value) {
        this.value = value;
    }

    @Override
    public double convertToStandardUnit() {
        return value*3.78;
    }
}
