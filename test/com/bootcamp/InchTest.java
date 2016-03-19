package com.bootcamp;

import com.bootcamp.compare.Inch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class InchTest {
    @Test
    public void should_give_the_sum_of_adding_two_inches() throws Exception {
        Inch inch_2 = new Inch(2);
        Inch inch_3 = new Inch(3);
        assertEquals(inch_2.add(inch_3),new Inch(5));
    }
}