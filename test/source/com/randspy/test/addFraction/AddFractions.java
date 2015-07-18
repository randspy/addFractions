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

    @Test
    public void addNumberToNumber() throws Exception {
        assertEquals(new Fraction(3), new Fraction(1).plus(new Fraction(2)));
    }

    @Test
    public void addZeroToNumberWithDenominator() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(0).plus(new Fraction(1, 2)));
    }

    @Test
    public void addNumberWithDenominatorToZero() throws Exception {
        assertEquals(new Fraction(1, 3), new Fraction(1, 3).plus(new Fraction(0)));
    }

    @Test
    public void addTwoNumbersWithDenominator() throws Exception {
        assertEquals(new Fraction(5, 6), new Fraction(1, 3).plus(new Fraction(1, 2)));
    }

    @Test
    public void addTwoNumbersWithReduction() throws Exception {
        assertEquals(new Fraction(2, 3), new Fraction(1, 3).plus(new Fraction(3, 9)));
    }

    @Test
    public void addNaturalNumberToNumberWithDenominator() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(1).plus(new Fraction(1, 2)));
    }

    @Test
    public void addZeroToNegativeNumber() throws Exception {
        assertEquals(new Fraction(-1,2), new Fraction(0).plus(new Fraction(-1, 2)));
        assertEquals(new Fraction(-1,2), new Fraction(0).plus(new Fraction(1, -2)));
    }

    @Test
    public void addNumberToNegativeNumber() throws Exception {
        assertEquals(new Fraction(-1,4), new Fraction(1,4).plus(new Fraction(-1, 2)));
    }

}
