package com.softuni.techmodule;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
        List<Integer> numList= Arrays.stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command;
        do {
            command=input.next();
            if (command.equals("add")) {
                int index=input.nextInt();
                int element=input.nextInt();
                numList.add(index, element);
            } else if (command.equals("addMany")) {
                int index=input.nextInt();
                List<String> stringArray=Arrays.stream(input.nextLine().split("\\s+"))
                        .collect(Collectors.toList());
                stringArray.remove(0);
                List<Integer> integerList=stringArray.stream().map(Integer::parseInt).collect(Collectors.toList());
                numList.addAll(index,integerList);

            } else if (command.equals("contains")) {
                int element=input.nextInt();
                if (numList.contains(element)) {
                    System.out.println(numList.indexOf(element));
                } else {
                    System.out.println(-1);
                }
            } else if (command.equals("remove")) {
                int index=input.nextInt();
                numList.remove(index);
            } else if (command.equals("shift")) {
                int positions=input.nextInt();
//                List<Integer> shiftedNums = new ArrayList<>(Collections.nCopies(numList.size(), 0));
//                for (int i = 0; i < numList.size(); i++) {
//                    int newPositionOfElement=((numList.size()-(i+positions))%numList.size());
//                    shiftedNums.set(newPositionOfElement, numList.get(i));
//                }
//                numList=shiftedNums;
                Collections.rotate(numList, numList.size()-positions);
            } else if (command.equals("sumPairs")) {
                List<Integer> summedList=new ArrayList<>();
                for (int i = 0; i < numList.size(); i+=2) {
                    if (numList.size() == 1) {
                        summedList.add(numList.get(i));
                        break;
                    }
                    summedList.add((numList.get(i)+numList.get(i+1)));
                    if (numList.size() % 2 == 1) {
                        numList.add(numList.get(numList.size()-1));
                    }

                }
                numList=summedList;
            }

        }while (command.equals("print")== false);
        System.out.println(Arrays.toString(numList.toArray()));
    }
}
