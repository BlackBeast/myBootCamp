package com.bootcamp.compare;/*
 * Job Of 
 */

public class Centimeter implements LengthUnits {
    private double value;

    public Centimeter(double value) {
        this.value = value;
    }


    @Override
    public double convertToStandardUnit() {
        return value * 0.4;
    }

    @Override
    public Units add(Units another) {
        return new Inch(convertToStandardUnit()+another.convertToStandardUnit());
    }

}
