package com.randspy.test.addFraction;

import addFraction.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractions {

    @Test
    public void addZeroToZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).add(new Fraction(0)));
    }

    @Test
    public void addZeroToNumber() throws Exception {
        assertEquals(new Fraction(5), new Fraction(0).add(new Fraction(5)));
    }


}
