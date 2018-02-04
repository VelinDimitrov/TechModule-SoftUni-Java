package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    String word=input.next();
	    char[] array=word.toCharArray();
        for (char number:array){
            System.out.println(number+" -> "+((int)number-'a'));
        }
    }
}
