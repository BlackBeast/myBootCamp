package com.bootcamp.compare;/*
 * Job Of 
 */

import com.bootcamp.exceptions.NonPositiveArgumentException;

public class Millimeter implements LengthUnits {
    private double value;

    private Millimeter(double value) {
        this.value = value;
    }

    public static Millimeter create(double value) throws NonPositiveArgumentException {
        if (value<0)
            throw new NonPositiveArgumentException(value);
        return new Millimeter(value);
    }

    @Override
    public double convertToStandardUnit() {
        return value * 0.04;

    }

    @Override
    public Units add(Units another) throws NonPositiveArgumentException {
        return Inch.create(convertToStandardUnit()+another.convertToStandardUnit());
    }

}
