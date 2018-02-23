package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    char[] wordInput=input.nextLine().toCharArray();

        for (int i = 0; i < wordInput.length; i++) {
            System.out.printf("\\u00%s",Integer.toHexString(wordInput[i]));
        }
    }
}
