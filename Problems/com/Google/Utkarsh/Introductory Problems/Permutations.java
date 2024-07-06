package com.Google.Utkarsh;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        System.out.println(f(5));
    }
    
    private static List<Integer> f(int n) {
        if (n == 1) return List.of(1);
		if (n == 2 || n == 3) return List.of();
		if (n == 4) return List.of(3,1,4,2);
		List<Integer> arr = new ArrayList<>();
		start(2, n, arr);
		start(1, n, arr);
		return arr;
    }

    private static void start(int s, int n, List<Integer> arr) {
        for (int i=s; i<=n; i+=2) {
            arr.add(i);
        }
    }
}
