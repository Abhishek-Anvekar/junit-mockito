package com.abhi.test.service;

public class CalculatorService {

    public static int addTwoNumbers(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static int productTwoNumber(int a,int b){
        int product=a*b;
        return product;
    }

    public static int divideTwoNumber(int a,int b){
        int result= a/b;
        return result;
    }

    public static int sumAnyNumber(int ...num){
        int sum=0;
        for(int i:num){
            sum +=i;
        }
        return sum;
    }

    //for testing assertThrow() in AssertExample class
    public static int divideForArithmeticException(int a ,int b){
        if (b==0){
            throw new ArithmeticException("number can't divided by zero");
        }
        return a/b;
    }
}
