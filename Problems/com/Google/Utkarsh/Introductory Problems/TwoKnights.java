package com.Google.Utkarsh;

public class TwoKnights {

    public static void main(String[] args) {
        System.out.println(f(3));
    }

    private static int f(int n) {
        int ans = 0;
        for (int r=0; r<n; r++) {
            for (int c=0; c<n; c++) {
                ans += (n*n) - ((r*n) + c+1);
                if (r < n-2) {
                    if (c < n-1) ans -= 1;
                    if (c > 0) ans -= 1;
                }
                if (c < n-2) {
                    if (r < n-1) ans -= 1;
                }
            }
        }
        return ans;
    }
    
}
