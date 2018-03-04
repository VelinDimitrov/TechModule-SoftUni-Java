package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int length=Integer.parseInt(input.readLine());
        String DNA=input.readLine();
        int bestSum=0;
        int bestLeftmostIndex=0;
        int bestSubsequenceOfOnesOnbestSequence=0;
        int[] bestSequence=new int[length];
        int samples=0;
        int bestSample=0;


        while (!(DNA.equals("Clone them!"))) {
            int[] sequence= Arrays.stream(DNA.split("[!]+")).mapToInt(x->Integer.parseInt(x)).toArray();

            samples++;
            int sum=0;
            int leftmostIndex=0;
            int subsequenceOfOnes=1;
            int bestSubsequenceOfOnes=1;


            for (int i = 0; i < sequence.length - 1; i++) {

                if (sequence[i] + sequence[i + 1] == 2) {
                    subsequenceOfOnes++;
                    if (bestSubsequenceOfOnes < subsequenceOfOnes) {
                        bestSubsequenceOfOnes=subsequenceOfOnes;
                        leftmostIndex=(i-subsequenceOfOnes)+2;
                    }


                }else{
                    subsequenceOfOnes=1;

                }



                if (sequence[i] == 1) {
                    sum++;
                }
            }

            if (sequence[length-1] == 1) {
                sum++;
            }

            if (leftmostIndex < bestLeftmostIndex || bestSubsequenceOfOnesOnbestSequence < bestSubsequenceOfOnes) {
                bestLeftmostIndex=leftmostIndex;
                bestSubsequenceOfOnesOnbestSequence=bestSubsequenceOfOnes;
                bestSequence=sequence;
                bestSum=sum;
                bestSample=samples;
            }
            if (leftmostIndex == bestLeftmostIndex && bestSubsequenceOfOnesOnbestSequence == bestSubsequenceOfOnes) {
                if (bestSum < sum) {
                    bestLeftmostIndex=leftmostIndex;
                    bestSubsequenceOfOnesOnbestSequence=bestSubsequenceOfOnes;
                    bestSequence=sequence;
                    bestSum=sum;
                    bestSample=samples;
                }
            }


            DNA=input.readLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n",bestSample,bestSum);
        for (int num :
                bestSequence) {
            System.out.print(num+" ");

        }


    }
}