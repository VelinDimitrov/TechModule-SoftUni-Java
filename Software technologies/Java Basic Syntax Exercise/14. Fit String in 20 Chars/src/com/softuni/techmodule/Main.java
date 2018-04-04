package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     String text=input.nextLine();
        if (text.length() > 20) {
            System.out.println(text.substring(0, 20));
        } else {
            text=padRight(20,'*',text);
            System.out.println(text);
        }
    }

    private static String padRight(int i, char c,String text) {
        StringBuilder newText=new StringBuilder(text);
        for (int j = 0; j < i; j++) {
            if (newText.length() < 20) {
                newText.append(c);
            }

        }
        return  newText.toString();
    }
}
