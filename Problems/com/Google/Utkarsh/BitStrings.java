package com.Google.Utkarsh;

public class BitStrings {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        return pow(2, n);
    }

    private static int pow(int a, int b) {
		if (b == 0)
			return 1;
		if (b == 1)
			return a;
		if ((b & 1) == 0)
			return pow(Utility.multiply(a, a), b >> 1);
		return Utility.multiply(a, pow(a, b - 1));
	}

}