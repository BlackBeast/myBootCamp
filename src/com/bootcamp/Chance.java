package com.bootcamp;/*
 * Job Of Chance is to claculate the chance of getting something.
 */

public class Chance {
    private double possibleOutcomesOfAUnit;
    private double noOfUnits;

    public Chance(double possibleOutcomesOfAUnit,double noOfUnits) {
        this.possibleOutcomesOfAUnit = possibleOutcomesOfAUnit;
        this.noOfUnits = noOfUnits;
    }

    private double calcutateSampleSpace(){
        return Math.pow(possibleOutcomesOfAUnit,noOfUnits);
    }
    public double chanceOfGetting(double favourableOutcome) {
        return favourableOutcome / calcutateSampleSpace();
    }

    public double chanceOfNotGetting(double favourableOutcome) {
        return 1.0 - chanceOfGetting(favourableOutcome);
    }
}
