package com.softuni.techmodule;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        List<Integer> numArr= Arrays.stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum=0;
        for (Integer number:numArr) {
            int reverseNumber=0;
            while (number > 0) {
                int lastDigit=number%10;
                number/=10;
                reverseNumber=reverseNumber*10+lastDigit;
            }
            sum+=reverseNumber;
        }
        System.out.println(sum);
    }
}
