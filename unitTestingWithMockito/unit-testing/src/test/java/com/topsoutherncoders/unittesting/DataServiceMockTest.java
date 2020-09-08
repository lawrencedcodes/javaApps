package com.topsoutherncoders.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DataServiceMockTest {

    @Test
    void calSumWithService() {
        BusinessImpl business = new BusinessImpl();
        Dataservice dataserviceMock = mock(Dataservice.class);
        // Dataservice retrieveAll method
        when(dataserviceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        business.setDataservice(dataserviceMock);
        int actualResult = business.calcSumWithService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void calcSumEmptyWithService() {
        BusinessImpl business = new BusinessImpl();
        Dataservice dataserviceMock = mock(Dataservice.class);
        when(dataserviceMock.retrieveAllData()).thenReturn(new int[]{});
        business.setDataservice(dataserviceMock);
        int testResult = business.calcSumWithService(); //new int[] {}
        int expected = 0;
        assertEquals(expected, testResult);
    }

    @Test
    void calcSumRepeatingWithService() {
        BusinessImpl business = new BusinessImpl();
        Dataservice dataservicemock2 = mock(Dataservice.class);
        when(dataservicemock2.retrieveAllData()).thenReturn(new int[] {9,9,9,9,9,9});
        business.setDataservice(dataservicemock2);
        int testResult = business.calcSumWithService(); //repeatingArray
        int expected = 54;
        assertEquals(expected, testResult);
    }
}