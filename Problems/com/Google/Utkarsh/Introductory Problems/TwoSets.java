package com.Google.Utkarsh;

public class TwoSets {

    public static void main(String[] args) {
        f(12);
    }

    private static void f(int n) {
        int sum = (n * (n + 1)) / 2;
        if ((sum & 1) == 1) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        printArray(n);
    }

    private static void printArray(int n) {
        int length = n / 2;
        System.out.println(length);
        if ((n & 1) == 0) {
            for (int i = 1; i <= length / 2; i++) {
                System.out.print(i + " ");
            }
            for (int i = n - (length / 2) + 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n" + length);
            for (int i = length / 2 + 1; i <= n - (length / 2); i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = 1; i <= length / 2; i++) {
                System.out.print(i + " ");
            }
            for (int i = n - (length / 2); i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n" + (length + 1));
            for (int i = length / 2 + 1; i < n - (length / 2); i++) {
                System.out.print(i + " ");
            }
        }
    }
}
