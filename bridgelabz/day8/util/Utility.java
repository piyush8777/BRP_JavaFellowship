package com.bridgelabz.day8.util;

import java.util.Arrays;

public class Utility {
	//Method to check if the given Strings are palindrome or not
    public static void checkPalindrome(String str) {
        String rev = "";

        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
    //Method to check if the given two strings are an Anagram and return boolean value.

    public static String Anagram(String str1, String str2) {
        //remove the all whitespaces and convert to lowercase
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;

        //Check wheather string length are equal or not
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            //convert the string to char array
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            //sort the array

            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            //Cheacking both array are equal or not
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
        return "";
    }
}


