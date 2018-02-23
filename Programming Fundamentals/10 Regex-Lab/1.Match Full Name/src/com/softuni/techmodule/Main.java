package com.softuni.techmodule;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        final String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        final String string = input.nextLine();

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.printf("%s ",matcher.group(0));
        }
    }
}
