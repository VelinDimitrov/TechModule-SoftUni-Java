package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

        ArrayList<dwarfCharacteristics> dwarfs=new ArrayList<>();
        String dwarfInfo=input.readLine();
        String regex="^(?<name>[^ \\<:\\>]+) <:> (?<hatColor>[^ \\<:\\>]+) <:> (?<physics>\\d+)";
        while (!dwarfInfo.equals("Once upon a time")) {
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(dwarfInfo);
            String dwarfName=null;
            String dwarfHatColor=null;
            String dwarfPhysics = null;
            while (matcher.find()) {
                dwarfName=matcher.group("name");
                dwarfHatColor=matcher.group("hatColor");
                dwarfPhysics=matcher.group("physics");
            }
            dwarfCharacteristics newDwarf=new dwarfCharacteristics(dwarfName,dwarfHatColor,dwarfPhysics);
            if (!dwarfs.contains(newDwarf)) {
                dwarfs.add(newDwarf);
            } else {
                for (int i = 0; i < dwarfs.size(); i++) {
                    if (dwarfs.get(i).containsPhysics(newDwarf)) {
                        dwarfs.set(i, newDwarf);
                    }
                }
            }
            dwarfInfo=input.readLine();
        }
        Collections.sort(dwarfs, new Comparator<dwarfCharacteristics>() {
            @Override
            public int compare(dwarfCharacteristics o1, dwarfCharacteristics o2) {
                int physicsCompare=o1.dwarfPhysics.compareTo(o2.dwarfPhysics);
                if (physicsCompare != 0) {
                    return physicsCompare;
                } else {
                    int colorCompare=-1*o1.dwarfHatColor.compareTo(o2.dwarfHatColor);
                    if (colorCompare != 0) {
                        return colorCompare;
                    } else {
                        return o1.dwarfName.compareTo(o2.dwarfName);
                    }
                }
            }
        });
        Collections.reverse(dwarfs);
        for (dwarfCharacteristics dwarf:dwarfs) {
            System.out.printf("(%s) %s <-> %s%n",dwarf.dwarfHatColor,dwarf.dwarfName,dwarf.dwarfPhysics);
        }
    }
}
class dwarfCharacteristics implements Comparator<dwarfCharacteristics>{
    String dwarfName;
    String dwarfHatColor;
    String dwarfPhysics;

    public dwarfCharacteristics(String dwarfName, String dwarfHatColor, String dwarfPhysics) {
        this.dwarfName = dwarfName;
        this.dwarfHatColor = dwarfHatColor;
        this.dwarfPhysics = dwarfPhysics;
    }

    public boolean containsPhysics(dwarfCharacteristics that) {
        if (Objects.equals(dwarfName, that.dwarfName) &&
                Objects.equals(dwarfHatColor, that.dwarfHatColor) &&
                !(Objects.equals(dwarfPhysics, that.dwarfPhysics))) {
            return true;
        }
        return false;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dwarfCharacteristics that = (dwarfCharacteristics) o;
        if (Objects.equals(dwarfName, that.dwarfName) && Objects.equals(dwarfHatColor, that.dwarfHatColor)) {
            return true;
        } else {
            return false;
        }


    }

    @Override
    public int hashCode() {

        return Objects.hash(dwarfName, dwarfHatColor, dwarfPhysics);
    }

    @Override
    public int compare(dwarfCharacteristics o1, dwarfCharacteristics o2) {
        int physicsCompare=o1.dwarfPhysics.compareTo(o2.dwarfPhysics);
        if (physicsCompare != 0) {
            return physicsCompare;
        } else {
            return o1.dwarfHatColor.compareTo(o2.dwarfHatColor);
        }
    }
}
