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
        String lineOfInput=input.readLine();
        String privateRegex="([0-9]+) <-> ([0-9\\/A-Za-z]+)";
        String broadcastRegex = "([^\\d]+) <-> ([A-Za-z\\/0-9]+)";
        Pattern privatePattern=Pattern.compile(privateRegex);
        Pattern broadcastPattern=Pattern.compile(broadcastRegex);

        List<String> privateMassages=new ArrayList<>();
        List<String> broadcastMassages=new ArrayList<>();
        while (!(lineOfInput.equals("Hornet is Green"))) {

            Matcher privatematcher=privatePattern.matcher(lineOfInput);


            Matcher broadcastMatcher=broadcastPattern.matcher(lineOfInput);

            if (privatematcher.find()) {
                privateMassages.add(new StringBuilder(privatematcher.group(1)).reverse().toString()+" -> "+privatematcher.group(2));
            } else if (broadcastMatcher.find()) {
                broadcastMassages.add(decryptFrequency(broadcastMatcher.group(2))+" -> "+broadcastMatcher.group(1));
            }



            lineOfInput=input.readLine();
        }
        System.out.println("Broadcasts:");
        if (!broadcastMassages.isEmpty()) {
            broadcastMassages.forEach(x -> System.out.println(x));
        } else {
            System.out.println("None");
        }
        System.out.println("Messages:");
        if (!privateMassages.isEmpty()) {
            privateMassages.forEach(x -> System.out.println(x));
        } else {
            System.out.println("None");
        }


    }
    private static String decryptFrequency(String encryptedFrequency)
    {
        //THE RESULT STRING
        String decryptedFrequency = "";

        //THE FOREACH THAT PASSES TROUGH ALL CHARACTERS
        for (char currentChar : encryptedFrequency.toCharArray())
        {
            //IF ITS AN UPPERCASE LETTER, MAKE IT A LOWERCASE
            //IF ITS A LOWERCASE LETTER, MAKE IT AN UPPERCASE
            //ELSE, JUST APPEND IT
            if (currentChar >= 65 && currentChar <= 90)
            {
                decryptedFrequency += (char)(currentChar + 32);
            }
            else if (currentChar >= 97 && currentChar <= 122)
            {
                decryptedFrequency += (char)(currentChar - 32);
            }
            else
            {
                decryptedFrequency += currentChar;
            }
        }

        //RETURN THE RESULT STRING
        return decryptedFrequency;
    }
}
