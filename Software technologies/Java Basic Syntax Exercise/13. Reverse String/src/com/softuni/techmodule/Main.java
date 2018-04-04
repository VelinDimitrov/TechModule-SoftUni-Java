package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     String word=input.nextLine();
        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
