package com.softuni.techmodule;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        List<Integer> numArr=Arrays.stream(input.nextLine().split("\\s+"))
                .map(n->Integer.parseInt(n))
                .collect(Collectors.toList());
        int count =1;
        int bestNum=numArr.get(0);
        int bestLength=1;
        for (int i = 1; i < numArr.size(); i++) {
            if (numArr.get(i - 1).equals(numArr.get(i))) {
                count++;
                if (count > bestLength) {
                    bestLength=count;
                    bestNum = numArr.get(i);
                }
            }else {
                count=1;
            }
        }
        for (int i = 0; i <bestLength ; i++) {
            System.out.print(bestNum+" ");
        }




    }
}
