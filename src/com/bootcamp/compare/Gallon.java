package com.bootcamp.compare;/*
 * Job Of 
 */

public class Gallon implements VolumeUnits{
    private double value;

    public Gallon(double value) {
        this.value = value;
    }

    @Override
    public double convertToStandardUnit() {
        return value*3.78;
    }

    @Override
    public Units add(Units another) {
        return null;
    }
}
