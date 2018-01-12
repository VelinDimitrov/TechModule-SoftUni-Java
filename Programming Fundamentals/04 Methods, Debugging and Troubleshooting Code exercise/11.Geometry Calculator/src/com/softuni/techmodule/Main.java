package com.softuni.techmodule;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String figure=input.next().toLowerCase();
        double result=getArea(figure);
        System.out.printf("%.2f",result);
    }

    private static double getArea(String figure) {
        Scanner input=new Scanner(System.in);
        double result=0,side,height,width,radius;
        switch (figure){
            case "triangle":
                side=input.nextDouble();
                height=input.nextDouble();
                result=side*height/2;
                break;
            case "square":
                side=input.nextDouble();
                result=side*side;
                break;
            case "rectangle":
                 width=input.nextDouble();
                 height=input.nextDouble();
                result=width*height;
                break;
            case "circle":
                 radius=input.nextDouble();
                result=Math.PI*radius*radius;
                break;
        }
        return result;
    }


}
