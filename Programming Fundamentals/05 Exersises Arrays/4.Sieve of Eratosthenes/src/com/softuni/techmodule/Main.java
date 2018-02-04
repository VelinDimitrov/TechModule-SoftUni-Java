package com.softuni.techmodule;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int limitToPrime=input.nextInt();
        boolean[] primes=new boolean[limitToPrime+1];
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        //all on second
        for (int i = 2; i < primes.length ; i++) {
            if (primes[i]) {
                for (int j = i+1; j <primes.length ; j++) {
                    if (j %i==0) {
                        primes[j]=false;
                    }
                }
            }
        }

        for (int i = 0; i <= limitToPrime; i++) {
            if (primes[i]) {
                System.out.print(i +" ");
            }
        }

    }
}
