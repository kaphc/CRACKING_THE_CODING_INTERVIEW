package com.company.Question4;

public class Question4 {

    public static boolean isPallindromePermutation(String word) {

        // Ask interviewer whether it is Unicode or ASCII
        int[] charSet = new int[128];
        int oddCountCharacters = 0;
        int charInInt;

        for (int i = 0; i < word.length(); i++) {
            charInInt = word.charAt(i);

            charSet[charInInt]++;
            if (charSet[charInInt] % 2 == 0) {
                oddCountCharacters--;
            } else {
                oddCountCharacters++;
            }
        }

        return oddCountCharacters <= 1;
    }

    public static void main(String[] args) {
        System.out.println(isPallindromePermutation("nkaiavkinv"));
        System.out.println(isPallindromePermutation("tact coa"));
        System.out.println(isPallindromePermutation("kavin"));
        System.out.println(isPallindromePermutation("kavin     nivak"));
        System.out.println(isPallindromePermutation(" "));
        System.out.println(isPallindromePermutation(""));
        System.out.println(isPallindromePermutation("ka vi n nak iv"));
        System.out.println(isPallindromePermutation("ka xvi n nak iv"));
        System.out.println(isPallindromePermutation("ka xvi n snak iv"));
    }
}
