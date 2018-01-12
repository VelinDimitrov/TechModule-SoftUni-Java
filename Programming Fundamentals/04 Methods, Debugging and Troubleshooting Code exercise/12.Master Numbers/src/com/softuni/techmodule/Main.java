package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        for (int i = 1; i <= number; i++) {
            if (checkNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkNumber(int number) {
        if (isSymetric(number) && sumOfDigits(number) && containEvenDigit(number)) {
            return true;
        }
        return false;
    }

    private static boolean containEvenDigit(int n) {
        while (n>0){
            if (n%2==0){
                return  true;
            }
            n/=10;
        }
        return false;
    }

    private static boolean sumOfDigits(int n) {
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        if (sum%7==0){
            return true;
        }
        return false;
    }

    private static boolean isSymetric(int n) {
        String num=String.valueOf(n);
        String reverse="";
        char[] reverseArray=num.toCharArray();
        for (int i = reverseArray.length-1; i >= 0; i--) {
            reverse+=reverseArray[i];
        }
        if (num.equals(reverse))
            return true;

        return false;
    }
}
