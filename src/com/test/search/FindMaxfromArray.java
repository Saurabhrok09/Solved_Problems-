package com.test.search;

public class FindMaxfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 25, 36, 98, 74, 69, 87, 4, 63, 1, 6, 4, 6 };
		int n = arr.length;

		System.out.println(optimizedMthd(arr, n));
	}

	public static int[] BrutForceMthd(int[] arr, int n) {
		// TODO Auto-generated method stub
//		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n - 1; j++) {
				if (arr[i] > arr[j + 1]) { // 25>36
					int tmp = arr[i]; // tmp = 25
					arr[i] = arr[j + 1];// arr[]0 = 36
					arr[j + 1] = tmp; // arr[i] = 25

				}
			}
		}
		return arr;

	}

	public static int optimizedMthd(int[] arr, int n) {
		// TODO Auto-generated method stub
		int max = arr[0];

		for (int i = 0; i < n - 1; i++) {

			if (arr[i] > max) { // 25>36
				max = arr[i];
			}
		}
		return max;

	}
}
