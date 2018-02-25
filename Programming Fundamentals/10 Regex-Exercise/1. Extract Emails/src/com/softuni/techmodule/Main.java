package com.softuni.techmodule;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    String text=input.nextLine();
        Pattern pattern=Pattern.compile("(^|(?<=\\s))[A-Za-z]+([.\\-_]\\w+)?@[\\w-]+(\\.\\w+)+\\b");
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()) {
            System.out.printf("%s%n",matcher.group());
        }
    }
}
