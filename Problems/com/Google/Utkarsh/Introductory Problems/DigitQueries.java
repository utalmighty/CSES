package com.Google.Utkarsh;

public class DigitQueries {


    public static int query(int n) {
        int prev = 0;
        int digit = 1;
        int till = prev + countDigit(digit);
        while (! (n >= prev && n <= till)) {
            digit += 1;
            prev = till;
            till = prev + countDigit(digit);
        }
        return algo(n, digit, prev);
    }

    public static int algo(int n, int digit, int last) {
        int rem = n-last;
        int skip = (rem-1)/digit;
        int val = (int) Math.pow(10, digit-1) + skip;
        int mod = (rem-1)%digit;
        String s = ""+val;
        String dig = ""+s.charAt(mod);
        return Integer.parseInt(dig);
    }

    private static int countDigit(int digit) {
        double start = Math.pow(10, digit-1);
        double end = Math.pow(10, digit) - 1;
        return (int) (end-start+1) * digit;
    }
}
