package com.softuni.techmodule;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] numsAsCommands = Arrays.stream(input.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

//        List<Integer> subListFromIntegers=numList.subList(0,numsAsCommands[0]);
////
////        for (int i = 0; i < numsAsCommands[1]; numsAsCommands[1]--) {
////            subListFromIntegers.remove(i);
////        }
        String present = "NO!";
////        for (Integer number :subListFromIntegers) {
////            if (number.equals(numsAsCommands[2])) {
////                present="YES!";
////            }
////        }
////        System.out.println(present);
        if (numList.stream().limit(numsAsCommands[0])
                .skip(numsAsCommands[1])
                .collect(Collectors.toList())
                .contains(numsAsCommands[2])) {

            present = "YES!";
        }
        System.out.println(present);
    }
}
