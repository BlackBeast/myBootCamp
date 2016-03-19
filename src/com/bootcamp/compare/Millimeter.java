package com.bootcamp.compare;/*
 * Job Of 
 */

public class Millimeter implements LengthUnits {
    private double value;

    public Millimeter(double value) {
        this.value = value;
    }

    @Override
    public double convertToStandardUnit() {
        return value * 0.04;

    }

    @Override
    public Units add(Units another) {
        return new Inch(convertToStandardUnit()+another.convertToStandardUnit());
    }

}
