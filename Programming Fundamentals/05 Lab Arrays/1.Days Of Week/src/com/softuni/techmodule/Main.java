package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayInNumber = in.nextInt();
        if (dayInNumber > 0 && dayInNumber < 8)
            System.out.println(days[dayInNumber - 1]);
        else
            System.out.println("Invalid Day!");

    }
}
