package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        long N=Long.parseLong(input.readLine());
        double M=Double.parseDouble(input.readLine());
        long P=Long.parseLong(input.readLine());
        double distance=(N/1000.0)*M;
        double flapsForASecond=N/100.0;
        double rest=(N/P)*5;
        double totalSeconds=rest+flapsForASecond;
        System.out.printf("%.2f m.%n%.0f s.",distance,totalSeconds);
    }
}
