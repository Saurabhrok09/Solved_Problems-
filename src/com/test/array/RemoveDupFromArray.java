package com.test.array;

public class RemoveDupFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2, 2, 3 };
		int newLen = removeDup(nums);
//		System.out.println(Arrays.toString(nums));
		for (int z = 0; z < newLen; z++) {
//			nums[i]= nums[z];
			System.out.print(nums[z] + " ");
		}

	}

	private static int removeDup(int[] nums) {
		// TODO Auto-generated method stub
		int i = 0, n = nums.length;
		for (int j = 1; j < n; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1; // we started from zero hence
	}

}
