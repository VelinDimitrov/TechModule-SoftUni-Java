package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String replace = email.split("@")[0];
        replace = email.replace(replace, new String(new char[replace.length()]).replace("\0", "*"));

        String text = input.nextLine();
        text = text.replaceAll(email, replace);

        System.out.println(text);

    }
}
