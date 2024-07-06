package com.Google.Utkarsh;

public class CoinPiles {

    public static void main(String[] args) {
        
        System.out.println(f(11, 4));
    }

    private static boolean f(int a, int b) {
        int diff = a-b;
        int high = a-(2*diff);
        int low  = b-diff;
        if (high == low) {
            if (high < 0) return false;
            if (high%3 == 0) return true;
        }
        return false;
    }
    
}
