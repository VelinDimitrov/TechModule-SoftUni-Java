package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(input.readLine());
        int M= Integer.parseInt(input.readLine());
        int Y= Integer.parseInt(input.readLine());

        int countOfPokemons=0;
        double half=N/2;

        while (N >= M) {
            N=N-M;

            if ((N == half)&&Y>0) {
                N=N/Y;
            }

            countOfPokemons++;
        }

        System.out.println(N);
        System.out.println(countOfPokemons);

    }
}
