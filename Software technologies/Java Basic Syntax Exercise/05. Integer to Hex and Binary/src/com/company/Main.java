package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int dec=input.nextInt();
        System.out.println(Integer.toHexString(dec).toUpperCase()+"\n"+Integer.toBinaryString(dec));
    }
}
