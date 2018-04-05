package com.softuni.techmodule;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sentences = input.nextInt();

        for (int i = 0; i < sentences; i++) {
            composeMessage();
        }
    }

    private static void composeMessage() {
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can't live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();
        String format = "%s %s %s – %s\n";

        int phraseIndex = random.nextInt(phrases.length);
        int eventIndex = random.nextInt(events.length);
        int authorIndex = random.nextInt(author.length);
        int cityIndex = random.nextInt(cities.length);
        System.out.printf(format, phrases[phraseIndex], events[eventIndex], author[authorIndex], cities[cityIndex]);
    }

}
