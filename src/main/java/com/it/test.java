package com.it;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class test {
    public static void main(String[] args) {
        BigDecimal m1 = new BigDecimal("1.0");
        BigDecimal m2 = new BigDecimal("1.00");
        System.out.println(m1.add(m2));
        System.out.println(m1.subtract(m2));
        System.out.println(m1.multiply(m2));
        System.out.println(m1.divide(m2, 2, RoundingMode.CEILING));
        System.out.println(m1.equals(m2));
        System.out.println(m1.compareTo(m2));
        System.out.println(m2.setScale(1, RoundingMode.CEILING));
        System.out.println("-----");


    }
}
