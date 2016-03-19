package com.bootcamp.compare;/*
 * Job Of 
 */

import com.bootcamp.exceptions.NonPositiveArgumentException;

public class Litre implements VolumeUnits{
    private double value;

    private Litre(double value) {
        this.value = value;
    }

    public static Litre create(double value) throws NonPositiveArgumentException {
        if (value<0)
            throw new NonPositiveArgumentException(value);
        return new Litre(value);
    }

    @Override
    public double convertToStandardUnit() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Litre litre = (Litre) obj;
        return Double.compare(round(litre.value,2), round(value,2)) == 0;

    }

    private double round(double value, int places) {
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    @Override
    public Units add(Units another) throws NonPositiveArgumentException {
        return create(convertToStandardUnit()+another.convertToStandardUnit());
    }
}
