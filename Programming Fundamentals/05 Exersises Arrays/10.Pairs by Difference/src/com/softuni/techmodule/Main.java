package com.softuni.techmodule;

import java.util.Scanner;

public class Main {
    public static int[] parseAsIntArray(String[] stringArray) {
        int[] temp = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            temp[i] = Integer.parseInt(stringArray[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = parseAsIntArray(input.nextLine().split("\\s+"));
        int diff=input.nextInt();
        int pairCount=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (Math.abs(array[i]-array[j])==diff) {
                    pairCount++;

                }
            }
        }
        System.out.println(pairCount);
    }
}
