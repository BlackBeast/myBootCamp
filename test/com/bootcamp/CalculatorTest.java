package com.bootcamp;

import com.bootcamp.compare.*;
import com.bootcamp.exceptions.InvalidTypesException;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void should_give_true_if_inch_length_and_feet_are_equal() throws Exception, InvalidTypesException {
        Feet lengthInFeet_2 = new Feet(2.0);
        Inch lengthInInch_24 = new Inch(24.0);
        Calculator calculator = Calculator.create(lengthInFeet_2, lengthInInch_24);
        Assert.assertTrue( calculator.compare());
    }

    @Test
    public void should_give_true_if_feet_and_inch_length_are_equal() throws Exception, InvalidTypesException {
        Feet lengthInFeet_2 = new Feet(2.0);
        Inch lengthInInch_24 = new Inch(24.0);
        Calculator calculator = Calculator.create( lengthInInch_24,lengthInFeet_2);
        Assert.assertTrue( calculator.compare());
    }
    @Test
    public void should_give_true_if_inch_length_and_centimeter_are_equal() throws Exception, InvalidTypesException {
        Centimeter lengthInCM = new Centimeter(1);
        Inch lengthInInch = new Inch(.4);
        Calculator calculator = Calculator.create(lengthInCM, lengthInInch);
        Assert.assertTrue(calculator.compare());
    }
    @Test
    public void should_give_true_if_millimeter_length_and_centimeter_are_equal() throws Exception, InvalidTypesException {
        Centimeter lengthInCM = new Centimeter(1);
        Millimeter lengthInMillimeter = new Millimeter(10);
        Calculator calculator = Calculator.create(lengthInCM, lengthInMillimeter);
        Assert.assertTrue(calculator.compare());
    }
    @Test
    public void should_give_true_if_litre_and_gallon_volume_are_equal() throws Exception, InvalidTypesException {
        Gallon volumeInGallon = new Gallon(1);
        Litre volumeInLitre = new Litre(3.78);
        Calculator calculator = Calculator.create(volumeInGallon, volumeInLitre);
        Assert.assertTrue(calculator.compare());
    }
    @Test
    public void should_give_an_exception_when_volume_and_length_want_to_compare() throws Exception, InvalidTypesException {
        thrown.expect(InvalidTypesException.class);
        thrown.expectMessage(CoreMatchers.is("Invalid types, required same type, but got different types"));
        Calculator.create(new Gallon(1),new Inch(1)).compare();
    }

    @Test
    public void should_be_able_to_add_units_and_gives_result_in_standard_unit() throws Exception, InvalidTypesException {
        Calculator calculator = Calculator.create(new Inch(2), new Centimeter(2.5));
        System.out.println("calculator = " + calculator.add());
        Assert.assertEquals(new Inch(3), calculator.add());

    }


}