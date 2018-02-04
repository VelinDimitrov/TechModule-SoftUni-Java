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
        int[] array=parseAsIntArray(input.nextLine().split("\\s+"));
        int rightSum=0;
        int leftSum=0;
        int index=-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i-1; j>= 0; j--) {
                leftSum+=array[j];
            }
            for (int r = i+1; r < array.length; r++) {
                rightSum+=array[r];
            }
            if (leftSum==rightSum) {
                index=i;
                break;
            }
            leftSum=0;
            rightSum=0;
        }
        System.out.println(index!=-1?index:"no");
    }

}
