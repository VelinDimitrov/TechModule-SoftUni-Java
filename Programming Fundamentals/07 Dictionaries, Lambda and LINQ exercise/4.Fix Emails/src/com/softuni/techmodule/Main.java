package com.softuni.techmodule;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);

        LinkedHashMap<String,String> emailBook=new LinkedHashMap<>();
	    String name;
	    String eMail;

        while ((name = input.nextLine()).equals("stop")==false) {
            eMail=input.nextLine();
            if (!(eMail.endsWith("us") || eMail.endsWith("uk"))) {
                emailBook.put(name, eMail);
            }
        }
        for (Map.Entry<String,String> pair:emailBook.entrySet() ){
            System.out.printf("%s -> %s%n",pair.getKey(),pair.getValue());
        }
    }
}
