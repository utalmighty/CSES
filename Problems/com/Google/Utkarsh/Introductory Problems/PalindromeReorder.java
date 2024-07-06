package com.Google.Utkarsh;


public class PalindromeReorder {

    public static void main(String[] args) {
        System.out.println(f("ABCDABCDXY"));
    }

    private static String f(String s) {
        int[] arr = getCount(s);
        StringBuilder sb = new StringBuilder();
        int midChar = -1;
        for (int i=0; i<26; i++) {
            if ((arr[i]&1) == 0) {
                for (int times=0; times<arr[i]/2; times++) {
                    sb.append((char) ('A' + i));
                }
            }
            else {
                if (midChar >= 0)
                    return "NO SOLUTION";
                midChar = i;
            }
        }

        String result = sb.toString();
        if (midChar >= 0) 
            result += (char) ('A'+midChar);
        result += sb.reverse();
        return result;
    }
    
    private static int[] getCount(String s) {
        int[] arr = new int[26];
        for (char c: s.toCharArray()) {
            arr[c-'A'] += 1;
        }
        return arr;
    }
}
