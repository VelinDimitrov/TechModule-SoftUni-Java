package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] foods=input.readLine().split(" ");
        long[] quantity= Arrays.stream(input.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        double[] prices= Arrays.stream(input.readLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        String lineOfCommand=input.readLine();
        while (!lineOfCommand.equals("done")) {
            String foodType=lineOfCommand.split(" ")[0];
            long quantityOfFood=Long.parseLong(lineOfCommand.split(" ")[1]);

            int indexOfFood=Arrays.asList(foods).indexOf(foodType);
            long totalFoodQuantity;
            try {
                totalFoodQuantity = quantity[indexOfFood];
            } catch (IndexOutOfBoundsException e) {
                totalFoodQuantity=0;
            }

            if (totalFoodQuantity >= quantityOfFood) {
                double totalPrice=quantityOfFood*prices[indexOfFood];
                System.out.printf("%s x %d costs %.2f%n",foodType,quantityOfFood,totalPrice);
                quantity[indexOfFood]-=quantityOfFood;
            } else {
                System.out.println("We do not have enough "+foodType);
            }


            lineOfCommand=input.readLine();
        }
    }
}
