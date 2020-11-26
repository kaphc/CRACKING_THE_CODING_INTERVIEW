package com.company.Question2;

public class Question2 {

    public static boolean isPermutation(String firstWord, String secondWord) {

        /* Ask interviewer about whether it is
        1. Unicode or ASCII
        2. Will it have extra space in between or at the ends
        3. Should the comparison be case sensitive
        */

        firstWord = firstWord.trim();
        secondWord = secondWord.trim();

        int[] charSet = new int[128];

        if(firstWord.length() != secondWord.length()) return false;

        for(int i=0; i<firstWord.length(); i++) {
            charSet[firstWord.charAt(i)]++;
        }

        int charInInt;

        for(int j=0; j<secondWord.length(); j++) {
            charInInt = secondWord.charAt(j);
            charSet[charInInt]--;
            if(charSet[charInInt] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("kavin", "kavin     "));
        System.out.println(isPermutation("kavin", "   "));
        System.out.println(isPermutation("", "kavin"));
        System.out.println(isPermutation("kavin", "kumar     "));
        System.out.println(isPermutation("kavin", "vkani"));
        System.out.println(isPermutation("kavin", "   vkani"));
        System.out.println(isPermutation("kavin", "vka ni"));
    }
}
