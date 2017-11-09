package com.example.demo.Service;

import com.example.demo.DAO.DataService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServiceMaxOfNumberTest {

    @Test
    public void findTheGreatestOfNumber() {

        DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[]{10, 20, 30});
        ServiceMaxOfNumber smn = new ServiceMaxOfNumber(dataService);
        int result = smn.findGreatestOfNumber();
        assertEquals(30, result);

    }


}
