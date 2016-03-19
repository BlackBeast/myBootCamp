package com.bootcamp.compare;/*
 * Job Of 
 */

import com.bootcamp.exceptions.NonPositiveArgumentException;

public interface Units {
    double convertToStandardUnit();
    Units add(Units another) throws NonPositiveArgumentException;
}
