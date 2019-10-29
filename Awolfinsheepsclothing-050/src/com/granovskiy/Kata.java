package com.granovskiy;

public class Kata {
    public static String warnTheSheep(String[] array) {
        int wolfPosition = 0;
        int wolfIndex;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                wolfPosition = i;
            }
        }
        wolfIndex = array.length - wolfPosition;
        if (wolfIndex == 1) {
            return "Pls go away and stop eating my sheep";
        }
        wolfIndex--;
        return "Oi! Sheep number " + wolfIndex +"! You are about to be eaten by a wolf!";
    }

    public static void main(String[] args) {
        System.out.println(warnTheSheep(
                new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        System.out.println(warnTheSheep(
                new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
    }
}
