package com.softuni.techmodule;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int factorial =in.nextInt();
        System.out.println(calculateFactorial(factorial));
    }

    private static BigInteger calculateFactorial(int factorial) {
        BigInteger number=BigInteger.valueOf(1);
        for (int i = 1; i <= factorial; i++) {
           number=number.multiply(BigInteger.valueOf(i));
        }
        return number;
    }
}
