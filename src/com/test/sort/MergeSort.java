package com.test.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 5, 6, 9, 87, 3, 6, 9, 7 };
		int arr2[] = { 8, 9, 6, 3, 97, 44, 56, 99, 87, 4, 133, 69, 55 };
		mtd(arr1, arr2);

	}

	public static int[] mtd(int[] arr1, int[] arr2) {
		int res[] = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				res[k++] = arr1[i++];
			} else {
				res[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			res[k++] = arr2[i++];
		}
		while (j < arr2.length) {
			res[k++] = arr2[j++];
		}

		System.out.println(Arrays.toString(res));
		return null;

	}

}
