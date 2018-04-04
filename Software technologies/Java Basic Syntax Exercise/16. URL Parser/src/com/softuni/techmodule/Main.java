package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     String URL=input.nextLine();
	     String protocol="";
	     String server="";
	     String resource="";

        if (URL.contains("://")) {
            int index=URL.indexOf("://");
            protocol=URL.substring(0,index);
        }

        if (URL)
    }
}
