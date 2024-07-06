package com.Google.Utkarsh;

/**
 * WeirdAlgorithm
 */
public class WeirdAlgorithm {

    public static void main(String[] args) {
        f(3);
    }

    private static void f(int n) {
        System.out.print(n + " ");
        if (n == 1) return;
        if ((n&1) == 0) f(n>>1);
        else f((n*3)+1);
    }
}