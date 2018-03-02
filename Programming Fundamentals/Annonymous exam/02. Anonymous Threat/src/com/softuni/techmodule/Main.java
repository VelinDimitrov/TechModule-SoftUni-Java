package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        List<String> stringInput= Arrays.stream(input.readLine().split(" "))
                .collect(Collectors.toList());

        String commandLine=input.readLine();
        while (!commandLine.equals("3:1")) {
            String[] commandInfo=commandLine.split(" ");
            String command =commandInfo[0];

            if (command.equals("merge")) {
                //perfect working algorithm
                int startIndex=Integer.parseInt(commandInfo[1]);
                int lastIndex=Integer.parseInt(commandInfo[2]);
                if (startIndex < 0) {
                    startIndex=0;
                } else if (startIndex >= stringInput.size()) {
                    startIndex=stringInput.size()-1;
                }
                if (lastIndex > stringInput.size() - 1) {
                    lastIndex=stringInput.size()-1;
                }

                StringBuilder temp=new StringBuilder(stringInput.get(startIndex));
                for (int i = startIndex; i < lastIndex; lastIndex--) {
                    temp.append(stringInput.remove(startIndex+1));
                }
                stringInput.set(startIndex, temp.toString());
                //perfect working algorithm

            } else if (command.equals("divide")) {
                int index=Integer.parseInt(commandInfo[1]);
                int partitions=Integer.parseInt(commandInfo[2]);
                StringBuilder elementAtIndex=new StringBuilder(stringInput.remove(index));

                if (elementAtIndex.length() % partitions == 0) {
                    int charsinSeperateElement = elementAtIndex.length() / partitions;
                    for (int i = index; i < partitions + index; i++) {
                        String newElement = elementAtIndex.substring(0, charsinSeperateElement);
                        stringInput.add(i, newElement);
                        elementAtIndex = elementAtIndex.delete(0, charsinSeperateElement);
                    }
                } else {
                    int charsinSeperateElement = elementAtIndex.length() / partitions;
                    int i;
                    for ( i = index; i < partitions + index-1; i++) {
                        String newElement = elementAtIndex.substring(0, charsinSeperateElement);
                        stringInput.add(i, newElement);
                        elementAtIndex = elementAtIndex.delete(0, charsinSeperateElement);
                    }
                    stringInput.add(i, elementAtIndex.toString());

                }

            }
            commandLine=input.readLine();
        }
        System.out.println(String.join(" ",stringInput ));
    }
}
