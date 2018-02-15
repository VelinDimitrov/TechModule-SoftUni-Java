package com.softuni.techmodule;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
        HashMap<String,String> phoneBook=new HashMap<>();
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

            }
        }while (command.equals("END")==false);
    }
}
