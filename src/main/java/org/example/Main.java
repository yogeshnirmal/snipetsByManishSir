package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

/*
problem Statement
* Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.

If the characters in str1 can be changed to get str2, then two strings, str1 and str2, are isomorphic. A character must be completely swapped out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

Example 1:

Input:
str1 = aab
str2 = xxy
Output:
1
Explanation:
There are two different characters in aab and xxy, i.e a and b with frequency 2 and 1 respectively.
Example 2:

Input:
str1 = aab
str2 = xyz
Output:
0
Explanation:
There are two different characters in aab but there are three different charactersin xyz. So there won't be one to one mapping between str1 and str2.*/

        //String str1 = "aab";
       // String str2 = "xxy";

        String str1 = "aab";
        String str2 = "xyz";

        if (str1.length() == str2.length()) {
            System.out.println(isomorphicExample(str1, str2));
        } else {
            System.out.println("both string has not equal length");
        }

    }

    public static int isomorphicExample(String str1, String str2) {
        HashMap<Character, Character> hashMap1 = new HashMap<>();
        HashMap<Character, Boolean> hashMap2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

         //   System.out.println("char1 " + char1);//x
           // System.out.println("char2 " + char2);//a
           // System.out.println("----------------------------");

            if (hashMap1.containsKey(char1) == true) {
                if (hashMap1.get(char1) != char2) {
                    return 0;
                }
            } else {
                if (hashMap2.containsKey(char2) == true) {
                    return 0;
                } else {
                    hashMap1.put(char1, char2);
                    hashMap2.put(char2, true);
                }
            }
        }
        return 1;
    }
}