package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     String bool=input.nextLine();
	     boolean condition=Boolean.parseBoolean(bool);
        if (condition) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
