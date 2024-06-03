package com.Google.Utkarsh;

public class Utility {

    public static int add(int a, int b) {
		int MOD = (int) (1e9 + 7);
		return (a + b) % MOD;
	}

	public static int multiply(long a, long b) {
		int MOD = (int) (1e9 + 7);
		long ans = (a * b) % MOD;
		return (int) ans;
	}

	public static int substract(int a, int b) {
		int MOD = (int) (1e9 + 7);
		int ans = ((a-b)%MOD + MOD) % MOD;
		return ans;
	}

	public static int binarySearch(int[] arr, int target) {
		return binarySearch(0, arr.length-1, arr, target);
	}

	private static int binarySearch(int low, int high, int[] arr, int target){
		if (high < low) return -1;
		int mid = low + (high-low+1)/2;
		if (target == arr[mid]) return mid;
		if (target < arr[mid]) return binarySearch(low, mid-1, arr, target);
		return binarySearch(mid+1, high, arr, target);
	}

	public static int binarySearchMyPlace(int[] arr, int target) {
		if(target > arr[arr.length-1]) return arr.length;
		if (target <= arr[0]) return 0;
		return binarySearchMyPlace(0, arr.length-1, arr, target);
	}

	private static int binarySearchMyPlace(int low, int high, int[] arr, int target){
		int mid = low + (high-low+1)/2;
		if(arr[mid] == target) return mid;
		if (arr[mid] > target && arr[mid-1] < target) return mid;
		if (target < arr[mid]) return binarySearchMyPlace(low, mid-1, arr, target);
		return binarySearchMyPlace(mid+1, high, arr, target);
	}
}