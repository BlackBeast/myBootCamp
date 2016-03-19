package com.bootcamp.compare;

import com.bootcamp.exceptions.InvalidTypesException;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void should_give_true_if_inch_length_and_feet_are_equal() throws Exception, InvalidTypesException {
        Feet lengthInFeet_2 = Feet.create(2.0);
        Inch lengthInInch_24 = Inch.create(24.0);
        Calculator calculator = Calculator.create(lengthInFeet_2, lengthInInch_24);
        assertTrue( calculator.compare());
    }
    @Test
    public void should_give_false_if_inch_length_and_feet_are_not_equal() throws Exception, InvalidTypesException {
        Feet lengthInFeet_2 = Feet.create(2.0);
        Inch lengthInInch_24 = Inch.create(25.0);
        Calculator calculator = Calculator.create(lengthInFeet_2, lengthInInch_24);
        assertFalse( calculator.compare());
    }

    @Test
    public void should_give_true_if_inch_length_and_centimeter_are_equal() throws Exception, InvalidTypesException {
        Centimeter lengthInCM = Centimeter.create(1);
        Inch lengthInInch = Inch.create(.4);
        Calculator calculator = Calculator.create(lengthInCM, lengthInInch);
        assertTrue(calculator.compare());
    }
    @Test
    public void should_give_true_if_millimeter_length_and_centimeter_are_equal() throws Exception, InvalidTypesException {
        Centimeter lengthInCM = Centimeter.create(1);
        Millimeter lengthInMillimeter = Millimeter.create(10);
        Calculator calculator = Calculator.create(lengthInCM, lengthInMillimeter);
        assertTrue(calculator.compare());
    }
    @Test
    public void should_give_true_if_litre_and_gallon_volume_are_equal() throws Exception, InvalidTypesException {
        Gallon volumeInGallon = Gallon.create(1);
        Litre volumeInLitre = Litre.create(3.78);
        Calculator calculator = Calculator.create(volumeInGallon, volumeInLitre);
        assertTrue(calculator.compare());
    }
    @Test
    public void should_give_an_exception_when_volume_and_length_want_to_compare() throws Exception, InvalidTypesException {
        thrown.expect(InvalidTypesException.class);
        thrown.expectMessage(CoreMatchers.is("Invalid types, required same type, but got different types"));
        Calculator.create(Gallon.create(1), Inch.create(1)).compare();
    }

    @Test
    public void should_be_able_to_add_lengths_units_and_gives_result_in_standard_length_unit_Inch() throws Exception, InvalidTypesException {
        Calculator calculator = Calculator.create(Inch.create(2), Centimeter.create(2.5));
        assertEquals(Inch.create(3), calculator.add());

    }

    @Test
    public void should_be_able_two_volumes_units_and_gives_the_result_in_standard_volume_unit_Litre() throws Exception, InvalidTypesException {
        Calculator calculator = Calculator.create(Gallon.create(1), Litre.create(1));
        assertEquals(Litre.create(4.78),calculator.add());
    }

    @Test
    public void should_give_an_exception_if_tried_to_add_two_different_types() throws Exception, InvalidTypesException {
        thrown.expect(InvalidTypesException.class);
        thrown.expectMessage(CoreMatchers.is("Invalid types, required same type, but got different types"));
        Calculator.create(Inch.create(2), Gallon.create(1)).add();

    }
}