package com.topsoutherncoders.unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.tags.EditorAwareTag;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DataserviceStub implements Dataservice {
    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3};
    }
}

class DataserviceEmptyStub implements Dataservice {
    @Override
    public int[] retrieveAllData() {
        return new int[]{};
    }
}

class DataserviceRepeatingStub implements Dataservice {
    @Override
    public int[] retrieveAllData() {
        return new int[]{9,9,9,9,9,9};
    }
}
class DataserviceStubTest {

    @Test
    void calSumWithService() {
        BusinessImpl business = new BusinessImpl();
        business.setDataservice(new DataserviceStub());
        int actualResult = business.calcSumWithService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void calcSumEmptyWithService() {
        BusinessImpl business = new BusinessImpl();
        business.setDataservice(new DataserviceEmptyStub());
        int testResult = business.calcSumWithService(); //new int[] {}
        int expected = 0;
        assertEquals(expected, testResult);
    }

    @Test
    void calcSumRepeatingWithService() {
        BusinessImpl business = new BusinessImpl();
        business.setDataservice(new DataserviceRepeatingStub());
        int testResult = business.calcSumWithService(); //repeatingArray
        int expected = 54;
        assertEquals(expected, testResult);
    }
}