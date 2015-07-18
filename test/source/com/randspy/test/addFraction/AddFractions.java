package com.randspy.test.addFraction;

import addFraction.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractions {

    @Test
    public void addZeroToZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void addZeroToNumber() throws Exception {
        assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5)));
    }

    @Test
    public void addNumberToZero() throws Exception {
        assertEquals(new Fraction(3), new Fraction(3).plus(new Fraction(0)));
    }


}
