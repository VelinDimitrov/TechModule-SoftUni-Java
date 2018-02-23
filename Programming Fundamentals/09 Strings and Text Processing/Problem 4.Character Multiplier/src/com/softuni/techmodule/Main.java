package com.softuni.techmodule;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
        String[] wordsInputted=input.nextLine().split(" ");
        int sum=0;

        for (int i = 0; i < biggerWord(wordsInputted[0],wordsInputted[1]).length(); i++) {
            int BiggerWordCharValue = (int)biggerWord(wordsInputted[0],wordsInputted[1] ).charAt(i);
            int littleWordCharValue;
            if (i<littleWord(wordsInputted[0],wordsInputted[1] ).length()) {
                littleWordCharValue = (int)littleWord(wordsInputted[0],wordsInputted[1]).charAt(i);
            } else {
                littleWordCharValue =1;
            }
            sum+=littleWordCharValue*BiggerWordCharValue;
        }

        System.out.println(sum);
    }

    private static String biggerWord(String s, String s1) {
        if (s.length() < s1.length()) {
            return s1;
        }
        return s;
    }
    private static String littleWord(String s, String s1) {
        if (s.length() < s1.length()) {
            return s;
        }
        return s1;
    }
}
