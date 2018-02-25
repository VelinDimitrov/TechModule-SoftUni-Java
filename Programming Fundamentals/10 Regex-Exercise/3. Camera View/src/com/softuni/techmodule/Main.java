package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    int[] quantifiers= Arrays.stream(input.readLine().split("\\s+"))
            .mapToInt(x->Integer.parseInt(x))
            .toArray();
        int skipSymbols=quantifiers[0];
        int takeSymbols=quantifiers[1];
        String text=input.readLine();
        String regex="\\|<(\\w{"+skipSymbols+"})(?<matchedWord>\\w{1,"+takeSymbols+"})";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        List<String> result=new ArrayList<>();
        while (matcher.find()) {
            result.add(matcher.group("matchedWord") );
        }
        System.out.println(String.join(", ", result));

    }
}
