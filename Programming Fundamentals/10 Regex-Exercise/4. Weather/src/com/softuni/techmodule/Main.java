package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String textLines = input.readLine();
        LinkedHashMap<String, List<String>> weather = new LinkedHashMap<>();
        String regex = "(?<city>[A-Z]{2})(?<number>\\d+\\.\\d{1,2})(?<weather>[A-Z-a-z]+)\\|";
        Pattern pattern = Pattern.compile(regex);

        while (!textLines.equals("end")) {
            Matcher matcher = pattern.matcher(textLines);
            while (matcher.find()) {
                String day = matcher.group("city");
                String averageTempaerature = matcher.group("number");
                String weatherType = matcher.group("weather");

                List<String> tempAndWeather = new ArrayList<>();
                tempAndWeather.add(averageTempaerature);
                tempAndWeather.add(weatherType);

                if (!weather.containsKey(day)) {
                    weather.put(day, tempAndWeather);
                } else {
                    weather.replace(day, tempAndWeather);
                }

            }
            textLines = input.readLine();
        }

            weather.entrySet().stream().sorted(Comparator.comparingDouble(x->Double.parseDouble(x.getValue().get(0))))
                    .forEach(x->{
                        System.out.printf("%s => %.2f => %s%n"
                                ,x.getKey()
                                ,Double.parseDouble(x.getValue().get(0))
                                ,x.getValue().get(1));
                    });




    }
}
