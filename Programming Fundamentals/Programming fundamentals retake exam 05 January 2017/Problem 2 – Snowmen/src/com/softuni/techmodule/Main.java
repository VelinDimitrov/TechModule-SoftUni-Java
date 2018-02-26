package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sequence= Arrays.stream(input.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (sequence.size()>1) {
            List<Integer> tempSequence=new ArrayList<>(sequence);


            List<Integer> lostSnowmen=new ArrayList<>();
            for (int i = 0; i < sequence.size(); i++) {
                int attackerIndex=i;
                int targetIndex=sequence.get(i)%sequence.size();
                int absolueValue= Math.abs(attackerIndex-targetIndex);
                if (lostSnowmen.contains(sequence.get(attackerIndex))) {
                    continue;
                }
                if (absolueValue == 0) {
                    System.out.printf("%d performed harakiri%n",attackerIndex);
                    lostSnowmen.add(sequence.get(attackerIndex));
                    tempSequence.remove(sequence.get(attackerIndex));
                } else if (absolueValue % 2 == 0) {
                    System.out.printf("%d x %d -> %d wins%n",attackerIndex,targetIndex,attackerIndex);
                    lostSnowmen.add(sequence.get(targetIndex));
                    tempSequence.remove(sequence.get(targetIndex));
                } else if (absolueValue % 2 == 1) {
                    System.out.printf("%d x %d -> %d wins%n",attackerIndex,targetIndex,targetIndex);
                    lostSnowmen.add(sequence.get(attackerIndex));
                    tempSequence.remove(sequence.get(attackerIndex));
                }

                if (tempSequence.size() ==1) {
                    break;
                }
            }
            sequence.removeAll(lostSnowmen);
        }
    }
}
