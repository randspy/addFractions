package com.randspy.test.addFraction;

import addFraction.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {
    @Test
    public void reduceNumber() throws Exception {
        assertEquals(new Fraction(1), new Fraction(2, 2));
        assertEquals(new Fraction(1, 2), new Fraction(2, 4));
        assertEquals(new Fraction(3, 4), new Fraction(24, 32));
    }


}
