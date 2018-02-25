package com.softuni.techmodule;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regexWord = input.nextLine();
	String[] sentence=input.nextLine().split("[\\!\\.\\?] ");
        String regex = "\\b" + regexWord + "\\b";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < sentence.length; i++) {
            Matcher match=pattern.matcher(sentence[i]);
            if (match.find()) {
                System.out.println(sentence[i]);
            }
        }

    }
}
