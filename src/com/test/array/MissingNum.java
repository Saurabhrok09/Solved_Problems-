package com.test.array;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[] { 1, 2, 3, 4, 6, 7 };
		optimize(numbers, 7);

	}

	public static void optimize(int[] arr, int n) {
		int len = arr.length, total_sum = 0, actual_sum = 0;
		actual_sum = n * ((n + 1) / 2);
		for (int i : arr) {
			total_sum += i;
		}
		System.out.println(actual_sum - total_sum);

	}

}
