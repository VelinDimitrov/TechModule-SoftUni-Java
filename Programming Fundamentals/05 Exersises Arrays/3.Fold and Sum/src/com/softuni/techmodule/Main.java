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
        int[] arrayToBeFolded = parseAsIntArray(input.nextLine().split("\\s+"));
        int k = arrayToBeFolded.length / 4;
        int[] arrayFromFolding = new int[2*k];
        //get left numbers
        for (int i = k-1, j = 0; i >= 0; i--, j++) {
            arrayFromFolding[j] = arrayToBeFolded[i];
        }

        //get right numbers
        for (int i = k,j=arrayToBeFolded.length-1; i <arrayFromFolding.length; i++,j--) {
            arrayFromFolding[i]=arrayToBeFolded[j];
        }


        //get sum
        int[] sum=arrayFromFolding.clone();
        for (int i = k,j=0; i <3*k ; i++,j++) {
            sum[j]+=arrayToBeFolded[i];
        }
        System.out.println(Arrays.toString(sum)
                .replace("[","")
                .replace(", "," ")
                .replace("]",""));
    }
}
