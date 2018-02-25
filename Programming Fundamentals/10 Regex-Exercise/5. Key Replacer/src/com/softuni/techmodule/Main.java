package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        //first patter for start and end word
        String regex="(?<startWord>\\w+)[\\<\\|\\\\].*[\\|\\<\\\\](?<endWord>\\w+)\\b";
        String startEndWordString=input.readLine();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(startEndWordString);
        String startWord = null;
        String endWord=null;
        while (matcher.find()) {
            startWord=matcher.group("startWord");
            endWord=matcher.group("endWord");
        }

        //second pattern for the sentence
        String sentenceWithTheWords=input.readLine();
        regex=startWord+"(?<wordInBetween>.*?)"+endWord;
        pattern=Pattern.compile(regex);
        matcher=pattern.matcher(sentenceWithTheWords);
        StringBuilder result=new StringBuilder();
        while (matcher.find()) {

            result.append(matcher.group("wordInBetween"));
        }
        if (result.length() == 0) {
            System.out.println("Empty result");
        } else {
            System.out.println(result);
        }

    }
}
