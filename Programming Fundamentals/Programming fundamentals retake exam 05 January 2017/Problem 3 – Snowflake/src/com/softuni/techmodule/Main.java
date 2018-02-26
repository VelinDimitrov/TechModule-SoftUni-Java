package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String surfaceRegex="^[^A-Za-z0-9]+";
        String mantelRegex="^[\\d_]+";
        String coreRegex="^([^A-Za-z0-9]+)([\\d_]+)(?<core>[A-Za-z]+)([\\d_]+)([^A-Za-z0-9]+)";

        String surface=input.readLine();
        boolean validSurface1=IsValid(surfaceRegex,surface);

        String mantel=input.readLine();
        boolean validMantel1=IsValid(mantelRegex, mantel);

        String core=input.readLine();
        int lengthOfCore=0;
        boolean validCore=true;
        Pattern pattern=Pattern.compile(coreRegex);
        Matcher matcher=pattern.matcher(core);
        if (matcher.find()) {
            lengthOfCore=matcher.group("core").length();
        } else {
            validCore=false;
        }

        mantel=input.readLine();
        boolean validMantel2=IsValid(mantelRegex, mantel);

         surface=input.readLine();
        boolean validSurface2=IsValid(surfaceRegex,surface);

        if (validMantel1 && validMantel2 && validSurface1 && validSurface2 && validCore) {
            System.out.println("Valid");
            System.out.println(lengthOfCore);
        } else {
            System.out.println("Invalid");
        }

    }

    private static boolean IsValid(String regex, String text) {
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        if (!matcher.find()) {
            return false;
        }
        return true;
    }


}
