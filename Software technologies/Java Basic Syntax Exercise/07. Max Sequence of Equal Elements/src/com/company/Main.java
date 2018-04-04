package com.company;

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
        int[] intArray = parseAsIntArray(input.nextLine().split(" "));
        int start = 0;
        int bestLen = 0;
        int len = 0;
        for (int i = 0; i < intArray.length-1; i++) {
            if (intArray[i] == intArray[i+1]) {
                len++;
                if (len>bestLen) {
                    start=i-len;
                    bestLen=len;
                }
            }
            else{
                len=0;
            }
        }

        for (int i = start+1; i <= bestLen + start+1; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}