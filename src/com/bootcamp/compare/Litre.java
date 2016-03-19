package com.bootcamp.compare;/*
 * Job Of 
 */

public class Litre implements Units{
    private double value;

    public Litre(double value) {
        this.value = value;
    }

    @Override
    public double convertToStandardUnit() {
        return value;
    }
}
