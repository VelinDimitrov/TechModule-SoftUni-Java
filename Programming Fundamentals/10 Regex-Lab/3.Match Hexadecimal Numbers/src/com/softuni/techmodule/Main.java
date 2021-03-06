package com.softuni.techmodule;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String regex = "\\b(0x)?[0-9ABCDEF]+\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()) {
            System.out.printf("%s ",matcher.group(0));
        }
    }
}
