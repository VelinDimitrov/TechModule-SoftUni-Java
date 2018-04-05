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
            URL=URL.split("://")[1];
        }

        if (URL.contains("/")) {
            int index = URL.indexOf('/');
            server = URL.substring(0, index);
            resource = URL.substring(index + 1);
        } else {
            server=URL;
        }
        System.out.printf("[protocol] = \"%s\"\n[server] = \"%s\"\n[resource] = \"%s\"",protocol,server,resource);
    }
}
