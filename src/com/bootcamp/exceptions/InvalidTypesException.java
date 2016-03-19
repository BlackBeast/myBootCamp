package com.bootcamp.exceptions;/*
 * Job Of 
 */

public class InvalidTypesException extends Throwable {
    public InvalidTypesException() {
        super("Invalid types, required same type, but got different types");
    }
}
