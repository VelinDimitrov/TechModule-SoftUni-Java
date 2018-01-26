package com.softuni.techmodule;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] numbers = Arrays.stream(input.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
        String[] numbersToBeSplitted = input.nextLine().split(" ");
        int[] numbers = new int[numbersToBeSplitted.length];
        for (int i = 0; i < numbersToBeSplitted.length; i++) {
            numbers[i] = Integer.parseInt(numbersToBeSplitted[i]);
        }
        if (checkForTripleSum(numbers)) {

        } else {
            System.out.println("No");
        }

    }

    private static boolean checkForTripleSum(int[] numbers) {
        boolean foundATripleSum = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                //advanced method
//                if (IntStream.of(numbers).anyMatch(x -> x==sum)){
//                    System.out.println(numbers[i]+" + "+numbers[j]+" == "+sum);
//                    foundATripleSum=true;
//                }
                for (int k = 0; k < numbers.length; k++) {
                    if (sum==numbers[k]) {
                        System.out.println(numbers[i]+" + "+numbers[j]+" == "+numbers[k]);
                        foundATripleSum=true;
                        break;
                    }
                }
            }

        }
        return foundATripleSum;
    }

}
