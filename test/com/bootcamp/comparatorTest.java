package com.bootcamp;

import com.bootcamp.compare.*;
import org.junit.Assert;
import org.junit.Test;

public class ComparatorTest {
    @Test
    public void should_give_true_if_inch_length_and_feet_are_equal() throws Exception {
        Feet lengthInFeet_2 = new Feet(2.0);
        Inch lengthInInch_24 = new Inch(24.0);
        Comparator comparator = new Comparator(lengthInFeet_2, lengthInInch_24);
        Assert.assertTrue( comparator.compare());
    }

    @Test
    public void should_give_true_if_feet_and_inch_length_are_equal() throws Exception {
        Feet lengthInFeet_2 = new Feet(2.0);
        Inch lengthInInch_24 = new Inch(24.0);
        Comparator comparator = new Comparator( lengthInInch_24,lengthInFeet_2);
        Assert.assertTrue( comparator.compare());
    }
    @Test
    public void should_give_true_if_inch_length_and_centimeter_are_equal() throws Exception {
        Centimeter lengthInCM = new Centimeter(1);
        Inch lengthInInch = new Inch(.4);
        Comparator comparator = new Comparator(lengthInCM, lengthInInch);
        Assert.assertTrue(comparator.compare());
    }
    @Test
    public void should_give_true_if_millimeter_length_and_centimeter_are_equal() throws Exception {
        Centimeter lengthInCM = new Centimeter(1);
        Millimeter lengthInMillimeter = new Millimeter(10);
        Comparator comparator = new Comparator(lengthInCM, lengthInMillimeter);
        Assert.assertTrue(comparator.compare());
    }
    @Test
    public void should_give_true_if_litre_and_gallon_volume_are_equal() throws Exception {
        Gallon volumeInGallon = new Gallon(1);
        Litre volumeInLitre = new Litre(3.78);
        Comparator comparator = new Comparator(volumeInGallon, volumeInLitre);
        Assert.assertTrue(comparator.compare());
    }
}