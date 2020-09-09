package com.topsoutherncoders.unittesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DataServiceMockTest {

    @InjectMocks
    BusinessImpl business = new BusinessImpl();
    @Mock
    Dataservice dataserviceMock;

    @Test
    void calSumWithService() {
        when(dataserviceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        assertEquals(6, business.calcSumWithService());
    }

    @Test
    void calcSumEmptyWithService() {
        when(dataserviceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(0, business.calcSumWithService());
    }

    @Test
    void calcSumRepeatingWithService() {
        when(dataserviceMock.retrieveAllData()).thenReturn(new int[] {9,9,9,9,9,9});
        assertEquals(54, business.calcSumWithService());
    }
}