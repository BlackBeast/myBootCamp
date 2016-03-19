package com.bootcamp.compare;/*
 * Job Of 
 */

import com.bootcamp.exceptions.NonPositiveArgumentException;

public class Centimeter implements LengthUnits {
    private double value;

    private Centimeter(double value) {
        this.value = value;
    }

    public static Centimeter create(double value) throws NonPositiveArgumentException {
        if (value<0)
            throw new NonPositiveArgumentException(value);

        return new Centimeter(value);
    }


    @Override
    public double convertToStandardUnit() {
        return value * 0.4;
    }

    @Override
    public Units add(Units another) throws NonPositiveArgumentException {
        return Inch.create(convertToStandardUnit()+another.convertToStandardUnit());
    }

}
