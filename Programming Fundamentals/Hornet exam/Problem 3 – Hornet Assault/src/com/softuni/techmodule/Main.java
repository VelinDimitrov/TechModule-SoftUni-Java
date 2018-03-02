package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<Long> beehivesBeesAmount= Arrays.stream(input.readLine().split(" "))
                .map(x->Long.parseLong(x))
                .collect(Collectors.toList());
        List<Long> hornetsPower= Arrays.stream(input.readLine().split(" "))
                .map(x->Long.parseLong(x))
                .collect(Collectors.toList());
            List<Long> beehivesRemaining=new ArrayList<>();
        while (!(beehivesBeesAmount.isEmpty()||hornetsPower.isEmpty())) {

            long summedPower = hornetsPower.stream().mapToLong(x -> x).sum();
            if (summedPower == 0) {
                continue;
            }
            if (beehivesBeesAmount.get(0) >= summedPower) {
                hornetsPower.remove(0);
                if ((beehivesBeesAmount.get(0) - summedPower) > 0) {
                    beehivesRemaining.add(beehivesBeesAmount.remove(0) - summedPower);
                } else if ((beehivesBeesAmount.get(0) - summedPower) == 0) {
                    beehivesBeesAmount.remove(0);
                }
            } else {
                beehivesBeesAmount.remove(0);
            }
        }
        if (!beehivesRemaining.isEmpty()) {
            for (Long bee:beehivesRemaining) {
                System.out.print(bee+" ");
            }
        } else {
            for (Long hornet:hornetsPower) {
                System.out.print(hornet+" ");
            }
        }
    }
}
