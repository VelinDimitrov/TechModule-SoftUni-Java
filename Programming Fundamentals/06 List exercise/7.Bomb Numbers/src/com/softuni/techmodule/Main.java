package com.softuni.techmodule;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numArr = Arrays.stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int specialNumber = input.nextInt();
        int power = input.nextInt();
        int sum = 0;
        while (numArr.contains(specialNumber)) {
            int index = numArr.indexOf(specialNumber);
            int endingIndex = (index - power) + 2 * power + 1;

            for (int i = (index - power) < 0 ? 0 : index - power;
                 i < (endingIndex > numArr.size() ? numArr.size() : endingIndex);
                 endingIndex--) {
                numArr.remove(i);

            }
        }
        for (Integer number : numArr) {
            sum += number;
        }
        System.out.println(sum);
    }
}
