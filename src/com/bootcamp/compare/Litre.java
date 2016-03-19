package com.bootcamp.compare;/*
 * Job Of 
 */

public class Litre implements VolumeUnits{
    private double value;

    public Litre(double value) {
        this.value = value;
    }

    @Override
    public double convertToStandardUnit() {
        return value;
    }

    @Override
    public Units add(Units another) {
        return null;
    }
}
