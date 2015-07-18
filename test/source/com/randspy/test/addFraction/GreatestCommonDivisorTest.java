package com.randspy.test.addFraction;

import addFraction.GreatestCommonDivisor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {

    private GreatestCommonDivisor gcd;

    @Before
    public void setUp() throws Exception {
        gcd = new GreatestCommonDivisor();
    }

    @Test
    public void twoDifferentNumbers() throws Exception {
        assertEquals(1, gcd.calculate(1, 2));
        assertEquals(2, gcd.calculate(4, 6));
        assertEquals(4, gcd.calculate(28, 32));
        assertEquals(1, gcd.calculate(29, 32));
    }

    @Test
    public void negativeNumbers() throws Exception {
        assertEquals(-1, gcd.calculate(-1, 2));
        assertEquals(-5, gcd.calculate(-10, -5));
    }

    @Test
    public void zero() throws Exception {
        assertEquals(1, gcd.calculate(1, 0));
        assertEquals(0, gcd.calculate(0, 0));
    }

}
