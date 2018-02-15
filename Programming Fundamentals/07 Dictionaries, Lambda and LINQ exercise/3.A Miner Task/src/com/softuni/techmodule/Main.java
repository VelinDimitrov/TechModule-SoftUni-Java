package com.softuni.techmodule;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
        LinkedHashMap<String,String> resources=new LinkedHashMap<>();
        String resource="";
        String quantity;
        while ((resource=input.nextLine()).equals("stop")==false) {
            quantity=input.nextLine();
            if (resources.containsKey(resource)) {
                int containedQuantity=Integer.parseInt(resources.get(resource));
                int inputedQuantity=Integer.parseInt(quantity);
                String newQuantity =Integer.toString((containedQuantity+inputedQuantity));
                resources.put(resource, newQuantity);
                continue;
            }
            resources.put(resource, quantity);
        }
        for (Map.Entry<String,String> pair:resources.entrySet()){
            System.out.printf("%s -> %s%n",pair.getKey(),pair.getValue());
        }
    }
}
