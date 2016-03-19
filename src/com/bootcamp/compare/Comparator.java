package com.bootcamp.compare;/*
 * Job Of 
 */

public class Comparator {
    private final Units unit;
    private final Units anotherUnit;

    public Comparator(Units unit, Units anotherUnit) {
        this.unit = unit;
        this.anotherUnit = anotherUnit;
    }

    public boolean compare() {
        return unit.convertToStandardUnit() == anotherUnit.convertToStandardUnit();
    }
}
