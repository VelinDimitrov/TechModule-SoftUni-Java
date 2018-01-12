package com.softuni.techmodule;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int factorial = in.nextInt();
        System.out.println(calculateTrailingZeros(factorial));
    }

    private static int calculateTrailingZeros(int factorial) {
        BigInteger number = BigInteger.valueOf(1);
        for (int i = 1; i <= factorial; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        int countOfZeros = 0;
        while (number.mod(BigInteger.valueOf(10)).equals(BigInteger.ZERO)) {
            number = number.divide(BigInteger.TEN);
            countOfZeros++;
        }

        return countOfZeros;
    }
}
