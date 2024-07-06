package com.Google.Utkarsh;

public class NumberSpiral {

    public static void main(String[] args) {
        System.out.println(f(10000, 10000));
    }
    

    private static int f(int r, int c) {
        if (r == c) {
            if ((r&1) == 0) return row(r, c);
            return col(r, c);
        }
        if (r > c) return row(r, c);
        return col(r, c);
    }

    private static int row(int r, int c) {
        if ((r&1) == 0) {
            int st = r*r;
            return st - c + 1;
        }
        int st = (r-1)*(r-1)+1;
        return st + c - 1;
    }

    private static int col(int r, int c) {
        if ((c&1) == 1) {
            int st = c*c;
            return st - r + 1;
        }
        int st = (c-1)*(c-1)+1;
        return st + c - 1;
    }
}
