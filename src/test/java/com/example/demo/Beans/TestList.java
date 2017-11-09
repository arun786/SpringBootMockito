package com.example.demo.Beans;


import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestList {

    @Test
    public void checkSizeInList() {

        List lstMock = mock(List.class);
        when(lstMock.size()).thenReturn(10);
        assertEquals(10, lstMock.size());
    }

    @Test
    public void checkSizeWithMultipleParameters() {
        List lstMock = mock(List.class);
        when(lstMock.size()).thenReturn(10).thenReturn(20).thenReturn(30);
        assertEquals(10, lstMock.size());
        assertEquals(20, lstMock.size());
        assertEquals(30, lstMock.size());
    }

    @Test
    public void checkGetOfList() {
        List mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("arun");
        assertEquals("arun", mockList.get(0));
    }

    @Test
    public void checkGetOfListForAnyParameter() {
        List mockList = mock(List.class);
        when(mockList.get(Mockito.anyInt())).thenReturn("arun");
        assertEquals("arun", mockList.get(0));
        assertEquals("arun", mockList.get(2));
    }

}
