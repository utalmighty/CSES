package com.Google.Utkarsh;

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(f(5, new int[] {2,3,1,5}));
    }
    
    private static int f(int n, int[] arr) {
        int rangeSum = (n*(n+1))/2;
        int sum = 0;
        for(int num: arr) {
            sum += num;
        }
        return rangeSum-sum;
    }
}
