package com.softuni.techmodule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        List<Integer> numArr= Arrays.stream(input.nextLine().split("\\s+"))
                .map(n ->Integer.parseInt(n))
                .collect(Collectors.toList());
        String command;
        do {
            command=input.next();
            if (command.equals("Delete")) {
                int element=input.nextInt();
                for (int i = 0; i < numArr.size(); i++) {
                    if (numArr.get(i).equals(element)) {
                        numArr.remove(i);
                        i--;
                    }
                }
            } else if (command.equals("Insert")) {
                int element=input.nextInt();
                int position=input.nextInt();
                numArr.add(position,element);
            }
        }while (!(command.equals("Odd")||command.equals("Even")));
        if (command.equals("Odd")) {
            for (Integer number :
                    numArr) {
                if (number % 2 == 1) {
                    System.out.print(number+" ");
                }
            }
        } else {
            for (Integer number :
                    numArr) {
                if (number % 2 == 0) {
                    System.out.print(number+" ");
                }
            }
        }
    }
}
