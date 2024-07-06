package com.Google.Utkarsh.SortingAndSearching;

import java.util.Arrays;

public class FerrisWheel {

    public static void main(String[] args) {
        int[] arr = {7,2,3,9};
        int k = 10;
        System.out.println(f(arr, k));
    }
    
    private static int f(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int cnt = 0;
        while(i<arr.length) {
            if (i+1 < arr.length && arr[i] + arr[i+1] <= k)
                i += 2;
            else i += 1;
            cnt += 1;
        }
        return cnt;
    }
}
