package com.softuni.techmodule;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     String text=input.nextLine();

	     String regex="<upcase>(.*?)<\\/upcase>";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);

        while (matcher.find()) {
            String replaceText=matcher.group(1).toUpperCase();
            text=matcher.replaceFirst(replaceText);

            matcher=pattern.matcher(text);
        }

        System.out.println(text);
    }
}
