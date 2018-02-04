package com.softuni.techmodule;

import java.util.Scanner;

public class Main {
        public static int[] parseAsIntArray(String[] stringArray){
          int[] temp =new int[stringArray.length];
          for (int i = 0; i < stringArray.length; i++) {
             temp[i] = Integer.parseInt(stringArray[i]);
          }
         return temp;
        }
    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
	    int [] array=parseAsIntArray(input.nextLine().split("\\s+"));
	    int bestNum=0;
	    int bestCount=0;
	    int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]==array[j]) {
                    count++;
                }
            }
            if (count>bestCount) {
                bestNum=array[i];
                bestCount=count;
            }
            count=0;
        }
        System.out.println(bestNum);

    }
}
