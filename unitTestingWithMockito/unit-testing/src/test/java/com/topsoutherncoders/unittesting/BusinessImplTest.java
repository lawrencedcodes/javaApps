package com.topsoutherncoders.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessImplTest {

    @Test
    void calcSum() {
        BusinessImpl business = new BusinessImpl();
        int testResult = business.calcSum(new int[] {1,2,3});
        int expected = 6;
        assertEquals(expected, testResult);
    }

    @Test
    void calcSumEmpty() {
        BusinessImpl business = new BusinessImpl();
        int testResult = business.calcSum(new int[] {});
        int expected = 0;
        assertEquals(expected, testResult);
    }

    @Test
    void calcSumRepeating() {
        BusinessImpl business = new BusinessImpl();
        int[] repeatingArray = {9,9,9,9,9,9,9,9};
        int testResult = business.calcSum(repeatingArray);
        int expected = repeatingArray[0] * repeatingArray.length;
        assertEquals(expected, testResult);
    }
}