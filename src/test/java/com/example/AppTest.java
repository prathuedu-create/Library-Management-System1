package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App calc = new App();

    @Test
    public void testAdd() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }
}
