package com.softuni.techmodule;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
        String[] baseAndNumber=input.nextLine().split(" ");
        int base=Integer.parseInt(baseAndNumber[0]);
        String number=baseAndNumber[1];
//        StringBuilder number=new StringBuilder(baseAndNumber[1]);
        BigInteger sum=BigInteger.ZERO;
        for (int i =number.length()-1,powNum=0; i >= 0; i--) {
            int numberToConvert=Integer.parseInt(String.valueOf(number.charAt(i)));
            BigInteger powNumber=BigInteger.valueOf(base).pow(powNum++);

            sum=sum.add(BigInteger.valueOf(numberToConvert).multiply(powNumber));
        }
        System.out.println(sum.toString());

    }
}
