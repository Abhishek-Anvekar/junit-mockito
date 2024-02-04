//package com.abhi.test.service;
//
//import org.junit.*;
//
//public class CalculatorServiceTest {
//          //  Junit 4

//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all class");
//        //used for - connection opening / file opening
//    }
//    @Before
//    public void beforeEach(){
//        System.out.println("before each test case");
//    }
//    @After
//    public void afterEach(){
//        System.out.println("After each test case");
//    }
//    @Test
//    public void addTwoNumbersTest(){
//        int result = CalculatorService.addTwoNumbers(5, 5);
//        int expected =10;
//
//        Assert.assertEquals(expected,result);
//        System.out.println("addTwoNumbersTest");
//    }
//    @Test
//    public void productTwoNumber(){
//        int result = CalculatorService.productTwoNumber(10, 2);
//        int expected=20;
//        Assert.assertEquals(expected,result);
//        System.out.println("productTwoNumber");
//    }
//
//    @Test
//    public void sumAnyNumbers(){
//        int result = CalculatorService.sumAnyNumber(1, 2, 3, 4);
//        int expectedResult=10;
//        Assert.assertEquals(expectedResult,result);
//        System.out.println("sumAnyNumbers");
//    }
//    @AfterClass
//    public static void cleanUp(){
//        System.out.println("After class");
//        //used for - cleanUp code /destroy
//    }
//}
