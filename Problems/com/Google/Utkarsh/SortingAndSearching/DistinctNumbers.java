package com.Google.Utkarsh.SortingAndSearching;
import java.util.Arrays;

public class DistinctNumbers {

    public static void main(String[] args) {
        int distint = f(new int[] {1});
        System.out.println(distint);
    }
    

    private static int f(int[] arr) {
        Arrays.sort(arr);
        int ans = 1;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] != arr[i-1]) ans++;
        }
        return ans;
    }
    //    .
    // [1,2,2,2,3]
}
