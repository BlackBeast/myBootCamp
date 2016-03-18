package com.bootcamp.exceptions;/*
 * Job Of 
 */

public class InValidPropabilityexception extends Exception {
    public InValidPropabilityexception(double value) {
        super("Expected a valid propability input but got:"+value);
    }
}
