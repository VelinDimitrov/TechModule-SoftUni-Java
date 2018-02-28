package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sequence = Arrays.stream(input.readLine().split(" "))
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList());
        int sumOfRemovedElements = 0;
        while (sequence.size() != 0) {
            int index = Integer.parseInt(input.readLine());
            int removedElement=0;
            if (index < 0) {
                removedElement=sequence.get(0);
                sequence.set(0, sequence.get(sequence.size() - 1));

            } else if (index > sequence.size() - 1) {
                removedElement=sequence.get(sequence.size()-1);
                sequence.set(sequence.size() - 1, sequence.get(0));


            } else {
                removedElement = sequence.remove(index);
            }



            for (int i = 0; i < sequence.size(); i++) {
                if (sequence.get(i) <= removedElement) {
                    sequence.set(i, sequence.get(i) + removedElement);

                } else if (sequence.get(i) > removedElement) {
                    sequence.set(i, sequence.get(i) - removedElement);
                }
            }
            sumOfRemovedElements+=removedElement;
        }
        System.out.println(sumOfRemovedElements);

    }
}