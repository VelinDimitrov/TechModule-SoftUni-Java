package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String regex="[starSTAR]";

        String planetRegex="@(?<name>[A-Za-z]+)([^@>\\-:!]*):(?<population>[0-9]+)([^@>\\-:!]*)!(?<type>[A-D])!([^@>\\-:!]*)->(?<soldierCount>[0-9]+)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher;
        List<String> atacked=new ArrayList<>();
        List<String> destroyed=new ArrayList<>();
        int counter=1;
        int n=Integer.parseInt(input.readLine());
        String lineOfInput;
        for (int i = 0; i < n; i++) {
            lineOfInput=input.readLine();
            int count=0;

            matcher=pattern.matcher(lineOfInput);
            while (matcher.find()) {
                count++;
            }
            StringBuilder decrypted=new StringBuilder();
            for (int j = 0; j <lineOfInput.length() ; j++) {
                char decriptingChar=(char)(lineOfInput.charAt(j)-count);
                decrypted.append(decriptingChar);
            }

            Pattern planetPattern =Pattern.compile(planetRegex);
            Matcher planetMatcher=planetPattern.matcher(decrypted.toString());
            if (planetMatcher.find()) {
                if (planetMatcher.group("type").equals("A")) {
                    atacked.add(planetMatcher.group("name"));

                } else if (planetMatcher.group("type").equals("D")) {
                    destroyed.add(planetMatcher.group("name"));
                }
            }



        }

        System.out.printf("Attacked planets: %d%n",atacked.size());
        Collections.sort(atacked);
        for (String planet :
                atacked) {
            System.out.println("-> "+planet);
        }
        System.out.printf("Destroyed planets: %d%n",destroyed.size() );
        Collections.sort(destroyed);
        for (String planet :
                destroyed) {
            System.out.println("-> " + planet);
        }
    }
}
