package com.softuni.techmodule;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        TreeMap<String,String> phoneBook=new TreeMap<>();
        String command;
        do {
            command=input.next();
            if (command.equals("A")) {
                String name = input.next();
                String number=input.next();
                phoneBook.put(name, number);
            } else if (command.equals("S")) {
                String name=input.next();
                if (phoneBook.containsKey(name)) {
                    System.out.printf("%s -> %s%n",name,phoneBook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.%n",name);
                }

            } else if (command.equals("ListAll")) {
                phoneBook.forEach((x,y)-> System.out.printf("%s -> %s%n",x,y));
            }
        }while (command.equals("END")==false);
    }
}
