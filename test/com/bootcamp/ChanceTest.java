package com.bootcamp;

import com.bootcamp.chance.Chance;
import com.bootcamp.exceptions.InValidPropabilityexception;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ChanceTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void exception_should_be_thrown_if_value_is_greater_than_1()throws Exception{
        thrown.expect(InValidPropabilityexception.class);
        thrown.expectMessage("Expected a valid propability input but got:1.2");
        Chance.create(1.2);
    }

    @Test
    public void exception_should_be_thrown_if_value_is_lesser_than_1()throws Exception{
        thrown.expect(InValidPropabilityexception.class);
        thrown.expectMessage("Expected a valid propability input but got:-1");
        Chance.create(-1);
    }

    @Test
    public void negate_should_return_not_getting_values() throws Exception {
        Chance coinChance = Chance.create(.5);
        Chance expected = Chance.create(.5);
        Assert.assertEquals(expected,coinChance.negate());
    }

    @Test
    public void and_should_return_product_of_the_propabilities_of_two_values() throws Exception{
        Chance coinChance = Chance.create(.5);
        Chance expected = Chance.create(.25);
        Assert.assertEquals(expected,coinChance.and(coinChance));
    }

    @Test
    public void or_should_return_sum_of_the_propabilities_of_two_values() throws Exception{
        Chance coinChance = Chance.create(.25);
        Chance expected = Chance.create(.5);
        Assert.assertEquals(expected,coinChance.or(coinChance));
    }

}