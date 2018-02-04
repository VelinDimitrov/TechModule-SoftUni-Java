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
        int count = 1;
        int start = 0;
        int bestCount = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] + 1 != array[i + 1] || i==array.length-2) && bestCount < count) {
                bestCount = count;
                start = (i-count)+1;
            }
            if (array[i] + 1 == array[i + 1]) {
                count++;
            }  else
                count = 1;
        }

        for (int i = start; i <= bestCount+start; i++) {
            System.out.print(array[i]+" ");
        }

    }
}

