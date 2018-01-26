package com.softuni.techmodule;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberElements = input.nextInt();

        int[] arr = new int[numberElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArr));

    }


}
