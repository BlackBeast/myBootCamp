package com.bootcamp.compare;/*
 * Job Of 
 */

import com.bootcamp.exceptions.NonPositiveArgumentException;

public class Gallon implements VolumeUnits {
    private double value;

    private Gallon(double value) {
        this.value = value;
    }

    public static Gallon create(double value) throws NonPositiveArgumentException {
        if (value<0)
            throw new NonPositiveArgumentException(value);
        return new Gallon(value);
    }

    @Override
    public double convertToStandardUnit() {
        return value * 3.78;
    }

    @Override
    public Units add(Units another) throws NonPositiveArgumentException {
        return Litre.create(convertToStandardUnit() + another.convertToStandardUnit());
    }
}
