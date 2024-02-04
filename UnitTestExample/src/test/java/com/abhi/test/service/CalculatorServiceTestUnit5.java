package com.abhi.test.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorServiceTestUnit5 {

    // Junit 5
    @BeforeAll
    public static void init(){
        System.out.println("Before All");
        //used for database connection opening / file opening etc
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("before each test case");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("After each test case");
    }
    @Test
    @DisplayName("my first test case") //custom name to test case
    public void addTwoNumbers(){
        System.out.println("first test case");
        int result = CalculatorService.addTwoNumbers(5, 5);
        int expected =10;
        Assertions.assertEquals(expected,result);
    }
    @Test
    @Disabled //testcase will be skipped
    public void sumAnyNumber(){
        System.out.println("Second test case");
        int result = CalculatorService.sumAnyNumber(1, 2, 3, 4);
        int expected=10;
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @CsvSource({"1,1,2","2,3,5","3,4,7"}) //1+1=2  2+3=5   3+4=7
    public void sumTwoNumbers(int a, int b,int expectedSum){
        int result = CalculatorService.addTwoNumbers(a, b);
        Assertions.assertEquals(expectedSum,result);
    }
    @AfterAll
    public static void cleanUp(){
        System.out.println("After all");
        // for clean up code - database closing / file closing statement
    }
}
