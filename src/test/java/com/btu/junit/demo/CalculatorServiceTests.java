package com.btu.junit.demo;

import com.btu.junit.demo.service.impl.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTests {

    @Autowired
    CalculatorService CalculatorService;

    @Test
    void additionTest() {
        int excepted = 12;
        int actual;
        actual = CalculatorService.addition(10, 2);
        assertEquals(excepted, actual);
    }

    @Test
    void substractionTest() {
        int excepted = 8;
        int actual;
        actual = CalculatorService.substraction(10, 2);
        assertEquals(excepted, actual);
    }

    @Test
    void multiplicationTest() {
        int excepted = 20;
        int actual;
        actual = CalculatorService.multiplication(10, 2);
        assertEquals(excepted, actual);
    }

    @Test
    void divisionTest() {
        double excepted = 5;
        double actual;
        actual = CalculatorService.division(10, 2);
        assertEquals(excepted, actual);
    }
}
