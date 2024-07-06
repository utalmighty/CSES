package com.Google.Utkarsh.IntroductoryProblems;


public class AppleDivision {
    
    public static void main(String[] args) {
        String s = "603 324 573 493 659 521 654 70 718 257";
        String[] a = s.split(" ");
        int[] arr = new int[a.length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        System.out.println(f(arr));
    }

    private static int f(int[] arr) {
        long suma = 0;
        long sumb = 0;
        for(int i=0; i<arr.length; i++) {
            if (suma <= sumb) {
                suma += arr[i];
            }
            else {
                sumb += arr[i];
            }
        }
        return (int) Math.abs(suma-sumb);
    }
}
