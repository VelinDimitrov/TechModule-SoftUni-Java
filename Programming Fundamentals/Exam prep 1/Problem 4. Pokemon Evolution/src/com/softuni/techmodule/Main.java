package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
//50/100
    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,LinkedHashMap<String,Integer>> pokemons=new LinkedHashMap<>();
        String lineOfInput;
        while (!(lineOfInput = input.readLine()).equals("wubbalubbadubdub")) {
            String[] pokeInfo=lineOfInput.split(" -> ");
            if (!(pokeInfo.length == 1)) {
                if (!pokemons.containsKey(pokeInfo[0])) {
                    LinkedHashMap<String, Integer> evolutionAndIndex = new LinkedHashMap<>();
                    evolutionAndIndex.put(pokeInfo[1], Integer.parseInt(pokeInfo[2]));
                    pokemons.put(pokeInfo[0], evolutionAndIndex);
                } else {
                    pokemons.get(pokeInfo[0]).put(pokeInfo[1], Integer.parseInt(pokeInfo[2]) );
                    if (!(pokemons.get(pokeInfo[0]).containsKey(pokeInfo[1]))) {
                        pokemons.get(pokeInfo[0]).put(pokeInfo[1], Integer.parseInt(pokeInfo[2]) );
                    }
                }

            } else {
                if (pokemons.containsKey(pokeInfo[0])) {
                    System.out.println("# "+pokeInfo[0]);
                    for (Map.Entry pair:
                            pokemons.get(pokeInfo[0]).entrySet()) {
                        System.out.printf("%s <-> %s%n",pair.getKey(),pair.getValue());
                    }
                }
            }

        }
//        pokemons.forEach((x,y)->y.entrySet().stream().sorted((pair1,pair2)->-1*(pair1.getValue().compareTo(pair2.getValue()))));
        for (Map.Entry pair:  pokemons.entrySet()){
            System.out.println("# "+pair.getKey());
            LinkedHashMap<String,Integer> newMap=(LinkedHashMap<String,Integer>)pair.getValue();
            newMap.entrySet().stream().sorted((pair1,pair2)->-1*(pair1.getValue().compareTo(pair2.getValue())))
                    .forEach(x-> System.out.printf("%s <-> %d%n",x.getKey(),x.getValue()));

        }

    }
    public void printPokemonInfo() {

    }
}
