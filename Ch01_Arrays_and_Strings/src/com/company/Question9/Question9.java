package com.company.Question9;

public class Question9 {

    public static boolean checkStringRotation(String word1, String word2) {
        if(word1.length() == word2.length()) {
            String word = word1 + word1;
            return word.contains(word2);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkStringRotation("kavin", "kumar"));
        System.out.println(checkStringRotation("waterbottle", "erbottlewat"));
        System.out.println(checkStringRotation("kavin", " "));
        System.out.println(checkStringRotation("kavin   ", "  kavin "));
    }
}
