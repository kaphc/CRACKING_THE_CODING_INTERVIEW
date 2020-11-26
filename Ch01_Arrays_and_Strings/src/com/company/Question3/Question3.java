package com.company.Question3;

public class Question3 {

    public static char[] urlify(char[] url, int originalLength) {

        for(int i=originalLength-1, j=(url.length-1); i>=0; i--) {
            if(url[i] != ' ') {
                url[j] = url[i];
                j--;
            } else {
                url[j] = '0';
                url[j-1] = '2';
                url[j-2] = '%';
                j-=3;
            }
        }

        return url;
    }
    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith    ".toCharArray(), 13));
        System.out.println(urlify(" Kavin  ".toCharArray(), 6));
        System.out.println(urlify("Kavin".toCharArray(), 5));
        System.out.println(urlify("   Ka vin        ".toCharArray(), 9));
    }
}
