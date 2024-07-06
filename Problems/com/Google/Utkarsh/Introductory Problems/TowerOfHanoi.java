package com.Google.Utkarsh;

public class TowerOfHanoi {


    public static void main(String[] args) {
        f('1', '2', '3', 16);
    }

    private static void f(char from, char helper, char to, int n) {
		if (n == 0) return;
		f(from, to, helper, n-1);
		System.out.println(from+" "+to);
		f(helper, from, to, n-1);
	}
}
