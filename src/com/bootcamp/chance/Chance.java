package com.bootcamp.chance;/*
 * Job Of Chance is to claculate the chance of something happening.
 */

import com.bootcamp.exceptions.InValidPropabilityexception;

public class Chance {
    private double value;

    public static Chance create(double value) throws InValidPropabilityexception {
        if (value < 0 || value > 1) {
            throw new InValidPropabilityexception(value);
        }
        return new Chance(value);
    }

    private Chance(double value) {
        this.value = value;
    }

    public Chance negate() throws InValidPropabilityexception {
        return create(1 - value);
    }

    public Chance and(Chance anotherValue) throws InValidPropabilityexception {
        return create(value * anotherValue.value);
    }

    public Chance or(Chance anotherValue) throws InValidPropabilityexception {
        return create(value + anotherValue.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance = (Chance) o;

        return Double.compare(chance.value, value) == 0;

    }
}
