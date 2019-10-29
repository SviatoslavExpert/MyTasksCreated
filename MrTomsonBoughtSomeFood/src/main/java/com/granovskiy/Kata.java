package com.granovskiy;

public class Kata {
    public static int findP(String[] food) {
        int counter = 0;
        for (String i : food) {
            if (i.charAt(0) == 'p') {
                counter++;
            }
        }
        return counter;
    }
}
