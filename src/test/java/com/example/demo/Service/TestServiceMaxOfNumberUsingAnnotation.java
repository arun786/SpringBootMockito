package com.example.demo.Service;


import com.example.demo.DAO.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceMaxOfNumberUsingAnnotation {

    @Mock
    private DataService dataService;

    @InjectMocks
    private ServiceMaxOfNumber serviceMaxOfNumber;

    @Test
    public void findGreatestOfNumber() {

        when(dataService.retrieveAllData()).thenReturn(new int[]{12, 34, 56});
        int result = serviceMaxOfNumber.findGreatestOfNumber();
        assertEquals(56, result);
    }

}
