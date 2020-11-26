package com.company.Question5;

public class Question5 {

    private static boolean checkIfOneCharIsReplaced(String word1, String word2) {
        int numberOfChangedChar = 0;

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                numberOfChangedChar++;
                if (numberOfChangedChar >= 2) {
                    return false;
                }
            }
        }

        return numberOfChangedChar == 1;
    }

    private static boolean checkIfOneCharIsAddedOrRemoved(String word1, String word2) {

        String smallString = word1.length() > word2.length() ? word2 : word1;
        String bigString = word1.length() > word2.length() ? word1 : word2;

        int numberOfChangedChar = 0;

        int i = 0, j = 0;
        while (i < smallString.length() && j < bigString.length()) {
            if (smallString.charAt(i) != bigString.charAt(j)) {
                numberOfChangedChar++;
                if (numberOfChangedChar >= 2) {
                    return false;
                }
            } else {
                i++;
            }
            j++;
        }

        return true;
    }

    public static boolean isOneEdit(String word1, String word2) {
        int lengthDifference = Math.abs(word1.length() - word2.length());

        if (lengthDifference == 0) {
            return checkIfOneCharIsReplaced(word1, word2);
        } else if (lengthDifference == 1) {
            return checkIfOneCharIsAddedOrRemoved(word1, word2);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // To test if length of two words is greater than 1
        System.out.println("\n" + isOneEdit("kavin", "kavinaa"));
        System.out.println(isOneEdit("kavin", "kav"));

        // To test if any one character is replaced
        System.out.println("\n" + isOneEdit("kavin", "kjvin"));
        System.out.println(isOneEdit("a", "b"));
        System.out.println(isOneEdit("kavin", "kavin"));
        System.out.println(isOneEdit("kavin", "kjvkn"));

        // To test if any one character is added
        System.out.println("\n" + isOneEdit("kavin", "kavina"));
        System.out.println(isOneEdit("kavin", "kxavin"));
        System.out.println(isOneEdit("avin", "kavin"));
        System.out.println(isOneEdit("", "a"));

        // To test if any one character is removed
        System.out.println("\n" + isOneEdit("kavin", "kavi"));
        System.out.println(isOneEdit("a", ""));
        System.out.println(isOneEdit("kavin", "kain"));
        System.out.println(isOneEdit("aaaa", "aaa"));
    }
}
