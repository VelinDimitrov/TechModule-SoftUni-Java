package com.softuni.techmodule;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String[] firstLine=input.nextLine().split(" ");
        String[] secondLine=input.nextLine().split(" ");
//        System.out.println(Arrays.toString(firstLine));
//        System.out.println(Arrays.toString(secondLine));
        int countFromLeft =0;
        int countFromRight=0;
        for (int i = 0; i < lessLength(firstLine.length,secondLine.length) ; i++) {
            if (firstLine[i].equals(secondLine[i]))
            {
                countFromLeft++;
            }
        }
        for (int i = firstLine.length-1,j=secondLine.length-1; i >=0&&j >=0  ; i--,j--) {
            if (firstLine[i].equals(secondLine[j])) {
                countFromRight++;
            }
        }
        System.out.println((countFromLeft>countFromRight)?countFromLeft:countFromRight);
    }

    static int lessLength(int length, int length2) {
        return (length > length2? length2 :length);
    }

}
