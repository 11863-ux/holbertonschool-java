package com.example.calculator.model;

public class Calculator {

    public Double sum(Double number1, Double number2) {
        // TODO
        // validation -> throw new NullPointerException("Number 1 and Number 2 are required.");
    }

    public Double sub(Double number1, Double number2) {
        // TODO
        // validation -> throw new NullPointerException("Number 1 and Number 2 are required.");
    }

    public Double divide(Double number1, Double number2) {
        // TODO
        // validation -> throw new NullPointerException("Number 1 and Number 2 are required.");
        // validation -> throw new ArithmeticException("Division by zero is not allowed.");
    }

    public Integer factorial(Integer factorial) {
        // TODO
        // validation -> throw new NullPointerException("Number is required.");
    }

    // Examples:
    // Integer = 1 -> Binary = 1
    // Integer = 5 -> Binary = 101
    // Integer = 20 -> Binary = 10100
    public Integer integerToBinary(Integer integer) {
        // TODO
    }

    // Examples:
    // Integer = 1 -> Hexadecimal = "1"
    // Integer = 55 -> Hexadecimal = "37"
    // Integer = 170 -> Hexadecimal = "AA"
    public String integerToHexadecimal(Integer integer) {
        // TODO
    }

    // Examples
    // Date 1 = LocalDate.of(2020, 3, 15);
    // Date 2 = LocalDate.of(2020, 3, 29)
    // Total days = 14
    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
        // TODO
    }

}
