package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static char[] parseAsIntArray(String[] stringArray) {
        char[] temp = new char[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            temp[i] = stringArray[i].charAt(0);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] firstArr = parseAsIntArray(input.nextLine().split("\\s+"));
        char[] secondArr = parseAsIntArray(input.nextLine().split("\\s+"));

        char[] firstAfterCheck = null;
        char[] secondAfterCheck = null;
        for (int i = 0; i < getSmallerSize(firstArr, secondArr); i++) {
            if (firstArr[i] == secondArr[i]) {
                continue;
            } else if (firstArr[i] < secondArr[i]) {
                firstAfterCheck = firstArr;
                secondAfterCheck = secondArr;
                break;
            } else {
                firstAfterCheck = secondArr;
                secondAfterCheck = firstArr;
                break;
            }
        }

        if (firstAfterCheck == null) {
            firstAfterCheck = getSmallerArray(firstArr, secondArr);
            secondAfterCheck = getBiggerArray(firstArr, secondArr);
        }
        System.out.println(Arrays.toString(firstAfterCheck)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", ""));
        System.out.println(Arrays.toString(secondAfterCheck)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", ""));
    }

    private static char[] getSmallerArray(char[] firstArr, char[] secondArr) {
        return firstArr.length > secondArr.length ? secondArr : firstArr;
    }

    private static char[] getBiggerArray(char[] firstArr, char[] secondArr) {
        return firstArr.length > secondArr.length ? firstArr : secondArr;
    }

    private static int getSmallerSize(char[] firstArr, char[] secondArr) {
        return firstArr.length > secondArr.length ? secondArr.length : firstArr.length;
    }


}