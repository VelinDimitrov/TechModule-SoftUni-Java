package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int numberOfSnowballs= Integer.parseInt(input.readLine());
        int bestSnowballSnow=0;
        int bestSnowballTime=0;
        int bestSnowballQuality = 0;
        BigInteger bestValue=BigInteger.ZERO;
        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow=Integer.parseInt(input.readLine());
            int snowballTime=Integer.parseInt(input.readLine());
            int snowballQuality=Integer.parseInt(input.readLine());
            BigInteger value=  BigInteger.valueOf((snowballSnow / snowballTime));
            value=value.pow(snowballQuality);
            if (bestValue.compareTo(value)<0) {
                bestSnowballSnow=snowballSnow;
                bestSnowballTime=snowballTime;
                bestSnowballQuality=snowballQuality;
                bestValue=value;
            }
        }
        System.out.printf("%d : %d = %d (%d)",bestSnowballSnow,bestSnowballTime,bestValue,bestSnowballQuality);
    }
}
