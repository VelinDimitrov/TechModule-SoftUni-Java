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

        while (true) {
            List<Boolean> canAtack=new ArrayList<>(Arrays.asList(new Boolean[sequence.size()]));
            Collections.fill(canAtack, Boolean.TRUE);
            List<Integer> tempSequence=new ArrayList<>();
            for (int i = 0; i < sequence.size(); i++) {
                int attackerIndex=i;
                int targetIndex=sequence.get(i)%sequence.size();
                int absolueValue= Math.abs(attackerIndex-targetIndex);
                if (!canAtack.get(attackerIndex)) {
                    continue;
                }

                if (absolueValue == 0) {
                    System.out.printf("%d performed harakiri%n",attackerIndex);
                    canAtack.set(attackerIndex, false);
                } else if (absolueValue % 2 == 0) {
                    System.out.printf("%d x %d -> %d wins%n",attackerIndex,targetIndex,attackerIndex);
                    canAtack.set(targetIndex, false);
                    tempSequence.add(attackerIndex);
                } else if (absolueValue % 2 == 1) {
                    System.out.printf("%d x %d -> %d wins%n",attackerIndex,targetIndex,targetIndex);
                    canAtack.set(attackerIndex, false);
                    tempSequence.add(targetIndex);
                }
                if (canAtack.size() == 2) {
                    return;
                }
            }
            sequence=tempSequence;

        }
    }
}
