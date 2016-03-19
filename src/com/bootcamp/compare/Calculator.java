package com.bootcamp.compare;/*
 * Job Of 
 */

import com.bootcamp.exceptions.InvalidTypesException;
import com.bootcamp.exceptions.NonPositiveArgumentException;

public class Calculator {
    private final Units unit;
    private final Units anotherUnit;

    private Calculator(Units unit, Units anotherUnit) {
        this.unit = unit;
        this.anotherUnit = anotherUnit;
    }

    public static Calculator create(Units unit, Units anotherUnit) throws InvalidTypesException {
        if((unit instanceof LengthUnits && anotherUnit instanceof LengthUnits) || (unit instanceof VolumeUnits && anotherUnit instanceof VolumeUnits))
            return new Calculator(unit, anotherUnit);
        throw new InvalidTypesException();
    }

    public boolean compare() {
        return unit.convertToStandardUnit() == anotherUnit.convertToStandardUnit();
    }

    public Units add() throws NonPositiveArgumentException {
         return unit.add(anotherUnit);
    }

}
