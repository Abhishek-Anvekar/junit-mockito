package com.abhi.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

    /*
        assertEquals() if two value/content equal then test pass
        assertSame() - if two object address same test pass
        assertArrayEquals() - if two array equal test pass
        assertIterableEquals() - if two list value's index not same test fail otherwise pass / both list size should same otherwise fail
        assertNull() -if null test pass
        assertNotNull() if not null test pass
        assertBoolean() - if true test pass
        assertTrue() - if value true test pass
        assertFalse() - if value false test pass
        assertThrows() - if method throwing same exception that we mentioned in test case then true otherwise false

        Mockito - mock object returns dummy data and avoid external dependencies
     */
    @Test
    public void assertArrayEqualstest(){
        int [] expectedArray = {1,2,3,4};
        int [] actualArray ={1,2,3,4};
        Assertions.assertArrayEquals(expectedArray,actualArray);
    }

    @Test
    public void assertSameTest(){
        //  object address of s1 and s2 is diffrent so test case will fail with assertSame()
        // if we used assertEquals() then testcase will pass because it will compare content
        String s1 = new String("java");
        String s2 = new String("java");
        //  object address of s3 and s4 is same so test case will pass with assertSame()
        // with assertEquals() also test pass
        String s3 = "java";
        String s4 = "java";
//        Assertions.assertSame(s1,s2);
//        Assertions.assertEquals(s1,s2);
        Assertions.assertSame(s3,s4);
//        Assertions.assertEquals(s3,s4);
    }
    @Test
    @DisplayName("null test for object")
    public void assertNullTest(){
        Object obj = null;
        Assertions.assertNull(obj);
    }
    @Test
    @DisplayName("assertIterableEquals testing")
    public void test(){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);

        Assertions.assertIterableEquals(list1,list2);
    }
    @Test
    public void assertThrow(){

        Assertions.assertThrows(ArithmeticException.class,()->{
            int result = CalculatorService.divideForArithmeticException(10, 0);
        });
    }
}
