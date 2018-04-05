package com.softuni.techmodule;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] firstInput = Arrays.stream(input.nextLine().split(" "))
                .mapToDouble(Float::parseFloat)
                .toArray();

        Circle firstCircl = new Circle(firstInput[0], firstInput[1], firstInput[2]);

        double[] secondInput = Arrays.stream(input.nextLine().split(" "))
                .mapToDouble(Float::parseFloat)
                .toArray();
        Circle secondCircl = new Circle(secondInput[0], secondInput[1], secondInput[2]);

        if (isIntersect(firstCircl, secondCircl)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isIntersect(Circle firstCircl, Circle secondCircl) {
           double getX=Math.pow((secondCircl.getX()-firstCircl.getX()),2);
        double formula=getX+Math.pow((secondCircl.getY()-firstCircl.getY()),2);
            double d=Math.sqrt(formula);

        if (d <= firstCircl.getRadius() + secondCircl.getRadius()) {
            return true;
        } else {
            return false;
        }
    }

}
