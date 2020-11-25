package com.company.Question1;

public class Question1 {

    public static boolean isUnique(String word) {

        /* Check with the interviewer whether it is a ASCII or Unicode String
        ASCII uses 7 bits -> 127 characters
        Extended ASCII uses 8 bits -> 255 characters
        Unicode -> 0-127 characters same as ASCII and
        Unicode can use 8, 16, 32 bits
         */

        if(word.length() > 128) {
            return false;
        }

        boolean[] charFlag = new boolean[128];

        for(int i=0; i<word.length(); i++) {
            int charInInt = word.charAt(i);
            if(charFlag[charInInt]) {
                return false;
            } else {
                charFlag[charInInt] = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("Kavin"));
        System.out.println(isUnique("Kumar"));
        System.out.println(isUnique("Kumar K"));
        System.out.println(isUnique("Kumar k"));
    }
}
