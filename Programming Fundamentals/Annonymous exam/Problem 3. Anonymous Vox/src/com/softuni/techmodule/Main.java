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
        String textRegex="([A-Za-z]+)(?<placeholder>.+)\\1";
        String text=input.readLine();

        String valuesLine=input.readLine();
        String valuesRegex="\\{([^\\{\\}]+)\\}";
        Pattern valuePattern=Pattern.compile(valuesRegex);
        Matcher valuesMatch=valuePattern.matcher(valuesLine);
        List<String> values=new ArrayList<>();
        while (valuesMatch.find()) {
            values.add(valuesMatch.group(1));
        }

        Pattern textPattern=Pattern.compile(textRegex);
        Matcher textMatch=textPattern.matcher(text);
        int index=0;

        while (textMatch.find()) {
            text=text.replace(textMatch.group("placeholder"), values.get(index));
            index++;
            if (index > values.size()-1) {
                index=0;
            }

        }
        System.out.println(text);

    }
}
