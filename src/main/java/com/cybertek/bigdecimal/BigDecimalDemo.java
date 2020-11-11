package com.cybertek.bigdecimal;
import java.math.BigDecimal;


public class BigDecimalDemo {

    public static void main(String[] args) {

        double a0=0.03;
        double b0=0.04;
        double c0=b0-a0;
        System.out.println(c0);
        java.math.BigDecimal a1 = new java.math.BigDecimal("0.03");
        java.math.BigDecimal b1 = new java.math.BigDecimal("0.04");
        java.math.BigDecimal c1 = b1.subtract(a1);
        System.out.println(c1);

//Creating a bigdecimal
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal("10.25");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(10.25);
        java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(10.25);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ONE;

//Arithmetic operators
        java.math.BigDecimal a = java.math.BigDecimal.TEN;
        java.math.BigDecimal b = java.math.BigDecimal.valueOf(3.5);
        java.math.BigDecimal c = java.math.BigDecimal.valueOf(4);
        java.math.BigDecimal sumResult = a.add(b);
        System.out.println(sumResult);
        java.math.BigDecimal sumReults2 = a.add(b).add(c);
        System.out.println(sumReults2);
        java.math.BigDecimal subtractResult = c.subtract(a).subtract(b);
        System.out.println(subtractResult);
        java.math.BigDecimal multiplyResult = c.multiply(b).multiply(a);
        System.out.println(multiplyResult);
        java.math.BigDecimal divideResult = a.divide(c);
        System.out.println(divideResult);
        java.math.BigDecimal divideResult2 = a.divide(b,2);
        System.out.println(divideResult2);
        java.math.BigDecimal combineResult = b.multiply(c).add(a).subtract(b);
        System.out.println(combineResult);
    }
}

