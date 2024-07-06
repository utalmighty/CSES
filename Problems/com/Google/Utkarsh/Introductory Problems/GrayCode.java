package com.Google.Utkarsh;

public class GrayCode {

    public static void main(String[] args) {
        code(4);
    }
    
    private static void code(int len) {
        boolean[] str = new boolean[len];
        str[len-1] = true;
        f(str, len-2, len, true);
    }

    private static void f(boolean[] str, int i, int len, boolean left) {
        print(str);
        if (isZeros(str)) return;
        str[i] = !str[i];
        if (left) {
            if (i == 0) f(str, i+1, len, !left);
            else f(str, i-1, len, left);
        }
        else {
            if (i == len-1) f(str, i-1, len, !left);
            else f(str, i+1, len, left);
        }
    }

    private static boolean isZeros(boolean[] arr) {
        for (boolean e: arr) {
            if (e) return false;
        }
        return true;
    }

    private static void print(boolean[] arr) {
        for (boolean e: arr) {
            if (e) System.out.print(1);
            else System.out.print(0);
        }
        System.out.println();
    }
}
