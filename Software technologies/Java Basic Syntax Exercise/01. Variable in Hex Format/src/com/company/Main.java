package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        String text=input.nextLine();
        int numInDecimal=Integer.parseInt(text,16);
        System.out.println(numInDecimal);
    }
}
