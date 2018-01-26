package com.softuni.techmodule;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        long[] arr=new long[n];
        arr[0]=1;
        for (int i = 1; i < arr.length ; i++) {
            for (int j = i-k; j <i ; j++) {
                if (j<0)
                    continue;
                arr[i]+=arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
