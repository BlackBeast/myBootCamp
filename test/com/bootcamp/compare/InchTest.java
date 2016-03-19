package com.bootcamp.compare;

import com.bootcamp.exceptions.InvalidTypesException;
import com.bootcamp.exceptions.NonPositiveArgumentException;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/*
 * Job Of 
 */
public class InchTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void should_be_able_to_add_lengths_units_inch_and_centimeter_and_gives_result_in_standard_length_unit_Inch() throws Exception, InvalidTypesException {
        Calculator calculator = Calculator.create(Inch.create(2), Centimeter.create(2.5));
        assertEquals(Inch.create(3), calculator.add());

    }
    @Test
    public void should_give_an_exception_when_negative_value_is_provided() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage(CoreMatchers.startsWith("Expected positive measurements but got "));
        Inch.create(-2);

    }
}