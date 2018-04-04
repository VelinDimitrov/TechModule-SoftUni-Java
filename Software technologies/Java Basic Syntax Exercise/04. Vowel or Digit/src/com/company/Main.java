package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 String ch=input.nextLine();
        if (ch.equals("a") || ch.equals("o")|| ch.equals("e")|| ch.equals("i")|| ch.equals("u")) {
            System.out.println("vowel");
        } else if (ch.equals("0") || ch.equals("1") || ch.equals("2") || ch.equals("3") || ch.equals("4") || ch.equals("5")
                || ch.equals("6") || ch.equals("7") || ch.equals("8") || ch.equals("9")) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}
