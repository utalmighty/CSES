package com.Google.Utkarsh;

public class IncreasingArray {

    public static void main(String[] args) {
        int[] arr = {6, 10, 4, 10, 2, 8 ,9 ,2, 7, 7};
        System.out.println(f(arr.length, arr));
    }
    

    private static long f(int n, int[] arr) {
        if (n == 1) return 0;
        long ans = 0;
        for(int i=1; i<n; i++) {
            if (arr[i] < arr[i-1]) {
                ans += arr[i-1] - arr[i];
                arr[i] = arr[i-1];
            }
        }
        return ans;
    }
}
