package com.softuni.techmodule;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
        String datesText=input.nextLine();
        String regex="\\b(?<day>\\d{2})([.\\/-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(datesText);
        while (matcher.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s%n",matcher.group(1)
                    ,matcher.group(3),matcher.group(4));
        }

    }
}
