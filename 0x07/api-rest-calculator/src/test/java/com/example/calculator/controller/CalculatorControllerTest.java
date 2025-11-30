package com.example.calculator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void sumTest() {
        assertEquals(15.0, calc.sum(10.0, 5.0));
    }

    @Test
    public void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> calc.sum(null, 5.0));
    }

    @Test
    void subTest() {
        assertEquals(5.0, calc.sub(10.0, 5.0));
    }

    @Test
    void divideTest() {
        assertEquals(2.0, calc.divide(10.0, 5.0));
    }

    @Test
    public void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10.0, 0.0));
    }

    @Test
    void factorialTest() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(101, calc.integerToBinary(5));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("AA", calc.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate d1 = LocalDate.of(2020,3,15);
        LocalDate d2 = LocalDate.of(2020,3,29);
        assertEquals(14, calc.calculeDayBetweenDate(d1, d2));
    }
}
