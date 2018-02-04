package com.softuni.techmodule;

import java.util.Arrays;
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
        int[] beforeRotateArray = parseAsIntArray(input.nextLine().split("\\s+"));

        int countOfRotates = Integer.parseInt(input.nextLine());

        int[] newArray = new int[beforeRotateArray.length];
        int[] sum = new int[beforeRotateArray.length];
        for (int i = 0; i < countOfRotates; i++) {
            for (int j = 0; j < newArray.length; j++) {
                newArray[(j + 1) % newArray.length] = beforeRotateArray[j];
            }
            beforeRotateArray = newArray.clone();


            for (int r = 0; r < sum.length; r++) {
                sum[r] += newArray[r];
            }
        }
        System.out.println(Arrays.toString(sum).replace("[", "")
                .replace(", ", " ").replace("]", ""));

    }
}
