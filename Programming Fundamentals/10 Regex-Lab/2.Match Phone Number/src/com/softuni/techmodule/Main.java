package com.softuni.techmodule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    String text=input.nextLine();
        Pattern regex=Pattern.compile("\\+359([ -])2\\1[0-9]{3}\\1\\d{4}\\b");
        Matcher matcher=regex.matcher(text);


        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        System.out.println(String.join(", ",matches));
    }
}
