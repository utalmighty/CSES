package com.Google.Utkarsh.SortingAndSearching;
import java.util.Arrays;

public class Apartments {

    public static void main(String[] args) {
        int[] apartments = {60,45,80,60};
        int[] req = {30,60,75};
        int k = 5;
        System.out.println(f(apartments, req, k));
    }
    
    private static int f(int[] ap, int[] req, int k) {
        Arrays.sort(ap);
        Arrays.sort(req);
        int i=0;
        int j=0;
        int ans=0;
        while (i < ap.length && j < req.length) {
            int diff = ap[i]-req[j];
            if (Math.abs(diff) <= k) {
                i++;
                j++;
                ans++;
            }
            else if (diff<0) // small apartment
                i++;
            else j++; // large apartment
        }
        return ans;
    }
}
