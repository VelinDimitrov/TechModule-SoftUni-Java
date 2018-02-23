package com.softuni.techmodule;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String textInput=input.nextLine();
        String regex="(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(textInput);
        while (matcher.find()) {
            System.out.printf("%s ",matcher.group());
        }
    }
}
