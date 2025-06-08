package com.test.array;

import java.util.Arrays;

public class RotateTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		int n = arr.length;

		rotateRight(arr, k, n);
		System.out.println("Rotated Array: " + Arrays.toString(arr));
	}

	private static void rotateRight(int[] arr, int k, int n) {
		// TODO Auto-generated method stub

		k = k % n;

		rotate(arr, 0, n - 1); // rotate all araay [5,4,3,2,1]
		rotate(arr, 0, k - 1); // 0 to 1 [4,5,3,2,1]
		rotate(arr, k, n - 1); // 2 to 4 [4,5,1,2,3]
	}

	private static int[] rotate(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while (start < end) {
			int tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;

		}
		return arr;
	}

}
