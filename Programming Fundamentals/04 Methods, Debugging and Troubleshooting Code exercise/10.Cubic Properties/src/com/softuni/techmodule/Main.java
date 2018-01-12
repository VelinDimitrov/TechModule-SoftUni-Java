package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double side =in.nextDouble();
        String typeOfFormula=in.next().toLowerCase();
        double result=calculateCubeProperties(side,typeOfFormula);
        System.out.printf("%.2f",result);
    }

    private static double calculateCubeProperties(double s, String typeOfFormula) {
       double result=0;
       switch (typeOfFormula){
           case "face":
               result=Math.sqrt(2*s*s);
               break;
           case "space":
               result=Math.sqrt(3*s*s);
               break;

           case "volume":
               result=Math.pow(s,3);
               break;

           case "area":
               result=6*s*s;
               break;
               default:


       }
        return result;
    }
}
