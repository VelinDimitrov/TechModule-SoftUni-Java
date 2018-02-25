package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        List<String> usernames= Arrays.stream(input.readLine().split("[ \\/\\\\\\(\\)]+"))
                .collect(Collectors.toList());
        String regex="(^|(?<=\\s))([A-Za-z]\\w{2,24})";
        Pattern pattern= Pattern.compile(regex);
        for (int i = 0; i < usernames.size(); i++) {
            Matcher matcher=pattern.matcher(usernames.get(i));
            if (!(matcher.find()&&usernames.get(i).length()>=3&&usernames.get(i).length()<=25)) {
                usernames.remove(i);
                i--;
            }
        }
        int bestLength=0;
        List<String> bestLengthWords=new ArrayList<>();
        for (int i = 0; i < usernames.size()-1; i+=1) {
            int sumOfLength=usernames.get(i).length()+usernames.get(i+1).length();
            if (bestLength < sumOfLength) {
                bestLengthWords.clear();
                bestLengthWords.add(usernames.get(i));
                bestLengthWords.add(usernames.get(i+1));
                bestLength=sumOfLength;
            }

        }
        if (usernames.size() == 1) {
            System.out.println(usernames.get(0));
        }
        System.out.println(String.join("\n",bestLengthWords ));
    }
}
