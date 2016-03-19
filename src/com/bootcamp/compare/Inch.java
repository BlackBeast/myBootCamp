package com.bootcamp.compare;/*
 * Job Of 
 */

public class Inch implements LengthUnits {
    private double value;

    public Inch(double value) {

        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Inch inch = (Inch) obj;

        return Double.compare(inch.value, value) == 0;

    }

    @Override
    public double convertToStandardUnit() {
        return value;
    }

    @Override
    public Units add(Units another) {
        return new Inch(convertToStandardUnit()+another.convertToStandardUnit());
    }

    @Override
    public String toString() {
        return value+"";
    }
}
