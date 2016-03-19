package com.bootcamp.compare;/*
 * Job Of 
 */

import com.bootcamp.exceptions.NonPositiveArgumentException;

public class Feet implements LengthUnits {
    private double value;

    private Feet(double value) {
        this.value = value;
    }

    public static Feet create(double value) throws NonPositiveArgumentException {
        if (value<0)
            throw new NonPositiveArgumentException(value);
        return new Feet(value);
    }

    @Override
    public double convertToStandardUnit() {
        return 12 * value;

    }
    @Override
    public Units add(Units another) throws NonPositiveArgumentException {
        return Inch.create(convertToStandardUnit()+another.convertToStandardUnit());
    }
}
