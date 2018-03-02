package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,List<KeySize>> data=new HashMap<>();
        HashMap<String,List<KeySize>> cache=new HashMap<>();
        String commandLines=input.readLine();
        while (!commandLines.equals("thetinggoesskrra")) {
            String[] commands=commandLines.split("( -> )|( \\| )");
            if (!(commands.length == 1)) {
                String dataKey=commands[0];
                String dataSet=commands[2];
                long dataSize=Long.parseLong(commands[1]);
                KeySize pair = new KeySize(dataKey, dataSize);


                if (!data.containsKey(dataSet)) {
                    if (!cache.containsKey(dataSet)) {
                        ArrayList<KeySize> temp = new ArrayList<>();
                        temp.add(pair);
                        cache.put(dataSet, temp);
                    } else {
                        cache.get(dataSet).add(pair);
                    }
                } else {
                    data.get(dataSet).add(pair);
                }


            } else {
                data.put(commands[0],new ArrayList<KeySize>() );
                if (cache.containsKey(commands[0])) {
                    data.get(commands[0]).addAll(cache.get(commands[0]));
                }
            }

            commandLines=input.readLine();
        }

        String bestDataSet="";
        long bestSum=0;
        if (!data.isEmpty()) {
            for (Map.Entry pair: data.entrySet()) {
                long totalSum=0;
                for (KeySize keySizePair:(List<KeySize>)pair.getValue() ) {
                    totalSum+=keySizePair.dataSize;
                }
                if (bestSum < totalSum) {
                    bestDataSet=(String) pair.getKey();
                    bestSum=totalSum;
                }
            }
            System.out.printf("Data Set: %s, Total Size: %d%n",bestDataSet,bestSum);
            data.get(bestDataSet).forEach(x-> System.out.printf("$.%s%n",x.dataKey));

        }

    }

}

class KeySize {
    String dataKey;
    long dataSize;


    public KeySize(String dataKey, long dataSize) {
        this.dataKey = dataKey;
        this.dataSize = dataSize;
    }



}
