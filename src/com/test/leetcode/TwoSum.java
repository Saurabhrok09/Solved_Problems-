package com.test.leetcode;

import java.util.HashSet;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, -1, 2, -3, 1 };
		int target = -2;

		// Call the twoSum function and print the result
		if (twoSum(arr, target)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	private static boolean twoSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int check = target - arr[i];
			if (set.contains(check)) {
				return true;
			}
			set.add(arr[i]);

		}
		return false;
	}

}
