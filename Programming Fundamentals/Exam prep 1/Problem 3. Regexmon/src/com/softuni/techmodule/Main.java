package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder lineOfText=new StringBuilder(input.readLine());
        String bojoRegex="[A-Za-z]+-[A-Za-z]+";
        String didiRegex="[^A-Za-z-]+";

        Pattern didiPatern=Pattern.compile(didiRegex);
        Matcher didiMatch = didiPatern.matcher(lineOfText);
        int indexOfDidiMatch;
        if (didiMatch.find()) {
            String match=didiMatch.group();
            indexOfDidiMatch=lineOfText.indexOf(match);
            lineOfText.delete(0, indexOfDidiMatch+match.length());
            System.out.println(match);
        }

        Pattern bojoPatern=Pattern.compile(bojoRegex);
        Matcher bojoMatch=bojoPatern.matcher(lineOfText);
        int indexOfBojoMatch;
        if (bojoMatch.find()) {
            String match=bojoMatch.group();
            indexOfBojoMatch=lineOfText.indexOf(match);
            lineOfText.delete(0, indexOfBojoMatch+match.length());
            System.out.println(match);
        }
        while (true) {

            didiPatern=Pattern.compile(didiRegex);
            didiMatch = didiPatern.matcher(lineOfText);
            if (didiMatch.find()) {
                String match=didiMatch.group();
                indexOfDidiMatch=lineOfText.indexOf(match);
                lineOfText.delete(0, indexOfDidiMatch+match.length());
                System.out.println(match);
            }else {
                break;
            }


             bojoPatern=Pattern.compile(bojoRegex);
             bojoMatch=bojoPatern.matcher(lineOfText);
            if (bojoMatch.find()) {
                String match = bojoMatch.group();
                indexOfBojoMatch = lineOfText.indexOf(match);
                lineOfText.delete(0, indexOfBojoMatch + match.length());
                System.out.println(match);
            } else {
                break;
            }


        }
    }
}
