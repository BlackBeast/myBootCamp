package com.bootcamp.compare;/*
 * Job Of 
 */

public class Feet implements LengthUnits {
    private double value;

    public Feet(double value) {
        this.value = value;
    }

    @Override
    public double convertToStandardUnit() {
        return 12 * value;

    }
    @Override
    public Units add(Units another) {
        return new Inch(convertToStandardUnit()+another.convertToStandardUnit());
    }
}
