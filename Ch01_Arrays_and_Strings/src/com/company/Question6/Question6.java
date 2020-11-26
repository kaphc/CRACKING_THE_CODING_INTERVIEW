package com.company.Question6;

public class Question6 {
    private static String stringCompression(String word) {
        char currentWord;
        int currentWordCount = 0;
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < word.length() - 1) {
            currentWord = word.charAt(i);
            if (currentWord != word.charAt(i + 1)) {
                result.append(word.charAt(i)).append(currentWordCount + 1);
                currentWordCount = 0;
            } else if (i + 1 == word.length() - 1) {
                result.append(word.charAt(i)).append(currentWordCount + 2);
            } else {
                currentWordCount++;
            }
            i++;
        }
        return result.length() > word.length() ? word : result.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringCompression(""));
        System.out.println(stringCompression("   "));
        System.out.println(stringCompression("kavin"));
        System.out.println(stringCompression("kkkkkkkaaaaaavvvvviiinnn"));
        System.out.println(stringCompression("kk   aaa kks dddd ss"));
    }
}
