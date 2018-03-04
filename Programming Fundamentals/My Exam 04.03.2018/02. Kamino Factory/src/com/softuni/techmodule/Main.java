package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double moneyAmount=Double.parseDouble(input.readLine());
        int studentsNumber=Integer.parseInt(input.readLine());
        double singleLightsaber=Double.parseDouble(input.readLine());
        double singleRobe=Double.parseDouble(input.readLine());
        double singleBelt=Double.parseDouble(input.readLine());
        int freeBelts=studentsNumber/6;
        double lightsabers=singleLightsaber*(studentsNumber+Math.ceil(studentsNumber*0.10) );
        double robes=studentsNumber*singleRobe;
        double belts=singleBelt*(studentsNumber-freeBelts);
        double result=lightsabers+robes+belts;
        if (result <= moneyAmount) {
            System.out.printf("The money is enough - it would cost %.2flv.",result);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.",result-moneyAmount);
        }
    }
}