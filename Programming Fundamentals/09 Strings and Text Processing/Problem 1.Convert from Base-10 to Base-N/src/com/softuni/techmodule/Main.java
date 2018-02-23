package com.softuni.techmodule;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String[] commands=input.nextLine().split(" ");
        int base=Integer.parseInt(commands[0]);
        BigInteger numberToConvert=new BigInteger(commands[1]);
        StringBuilder stringBuilder=new StringBuilder();

        while (!numberToConvert.equals(BigInteger.ZERO)) {
            stringBuilder.append(numberToConvert.mod(BigInteger.valueOf(base)));
            numberToConvert=numberToConvert.divide(BigInteger.valueOf(base));
        }
        System.out.println(stringBuilder.reverse());
    }
}
