package com.bootcamp.compare;

import com.bootcamp.exceptions.NonPositiveArgumentException;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UnitsTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void inch_create_method_should_give_an_exception_when_negative_value_is_provided() throws Exception {
       thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage(CoreMatchers.startsWith("Expected positive measurements but got "));
        Inch.create(-2);

    }
    @Test
    public void feet_create_method_should_give_an_exception_when_negative_value_is_provided() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage(CoreMatchers.startsWith("Expected positive measurements but got "));
        Feet.create(-2);

    }

    @Test
    public void millimeter_create_method_should_give_an_exception_when_negative_value_is_provided() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage(CoreMatchers.startsWith("Expected positive measurements but got "));
        Millimeter.create(-2);
    }
    @Test
    public void gallon_create_method_should_give_an_exception_when_negative_value_is_provided() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage(CoreMatchers.startsWith("Expected positive measurements but got "));
        Gallon.create(-2);

    }
    @Test
    public void litre_create_method_should_give_an_exception_when_negative_value_is_provided() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage(CoreMatchers.startsWith("Expected positive measurements but got "));
        Litre.create(-2);
    }
}