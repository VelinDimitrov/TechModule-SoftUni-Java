package com.softuni.techmodule;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedHashMap<String, String> cardPlayers = new LinkedHashMap<>();

        String name;

        while ((name = input.next()).equals("JOKER")==false) {
            if (name.indexOf(':')<0) {
                String secondName=input.next();
                name=name+" "+secondName;
            }
           StringBuilder buildCards = new StringBuilder(input.nextLine());
           buildCards.deleteCharAt(0);
           String drawnCards=buildCards.toString();
            if (cardPlayers.containsKey(name)) {
                cardPlayers.put(name, (cardPlayers.get(name)+", "+drawnCards));
            } else {
                cardPlayers.put(name, drawnCards);
            }
        }
        for (Map.Entry<String, String> pair : cardPlayers.entrySet()) {
            HashSet<String> cardPairs=new HashSet<>(Arrays.asList(pair.getValue().split(", ")));
            int sum=0;
            for (String cardCombination : cardPairs) {
                sum+=numberInCards(cardCombination);
            }
            System.out.printf("%s %d%n",pair.getKey(),sum);
        }


    }

    private static int numberInCards(String card) {
        final int J = 11;
        final int Q = 12;
        final int K = 13;
        final int A = 14;
        char firstNumber = card.charAt(0);
        int sum = 0;
        char lastSymbol = card.charAt(card.length() - 1);
        switch (firstNumber) {
            case ' ':
                break;
            case 'J':
                sum += J;
                break;
            case 'Q':
                sum += Q;
                break;
            case 'K':
                sum += K;
                break;
            case 'A':
                sum += A;
                break;
            case '1':
                sum += 10;
                break;
            default:
                sum += firstNumber - '0';
        }

        switch (lastSymbol) {
            case 'S':
                sum *= 4;
                break;
            case 'H':
                sum *= 3;
                break;
            case 'D':
                sum *= 2;
                break;
        }
        return sum;
    }
}
