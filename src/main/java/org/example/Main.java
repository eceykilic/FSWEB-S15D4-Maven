package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public static boolean checkForPalindrome(String text) {
        String cleanText = text.toLowerCase(Locale.ENGLISH).replaceAll("[^a-zA-Z]", "");
        int n = cleanText.length();
        for (int i = 0; i <= n / 2; i++) {
            if (cleanText.charAt(i) != cleanText.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int n){
        LinkedList<Integer> binaryList = new LinkedList<>();
        while(n > 0){
            int r = n % 2;
            binaryList.addFirst(r);
            n /= 2;
        }
        StringBuilder sb = new StringBuilder();
        for(int number : binaryList){
            sb.append(number);
        }
        return  sb.toString();
    }

}