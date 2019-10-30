package com.granovskiy.com;

public class Kata {
    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        if (original.length() > 0 && words.length == 0) {
            return original;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                builder.append(words[i].charAt(j));
            }
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));
        System.out.println(reverseWords("          "));
    }
}
