package com.bootcamp.compare;/*
 * Job Of 
 */

public class Inch implements Units {
    private double value;

    public Inch(double value) {

        this.value = value;
    }

    public Inch add(Inch another) {
        return new Inch(value + another.value);
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
}
