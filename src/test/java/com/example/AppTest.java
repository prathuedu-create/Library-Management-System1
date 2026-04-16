package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testNoFine() {
        int result = App.calculateFine(5);
        assertEquals(0, result);
    }

    @Test
    public void testWithFine() {
        int result = App.calculateFine(10);
        assertEquals(15, result); // (10-7)*5 = 15
    }

    @Test
    public void testExactLimit() {
        int result = App.calculateFine(7);
        assertEquals(0, result);
    }
}

