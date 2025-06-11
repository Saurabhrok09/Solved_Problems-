package com.test.leetcode;

import java.util.HashSet;

public class MaxSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(mtd(s));
	}

	private static String mtd(String s) {
		// TODO Auto-generated method stub
		int start = 0, current, maxVal = 0;
		HashSet<Character> st = new HashSet<>();
		for (current = 0; current < s.length(); current++) {
			while (st.contains(s.charAt(current))) {
				st.remove(s.charAt(start));
				start++;
			}
			st.add(s.charAt(current));
			maxVal = Math.max(maxVal, current - start + 1);

		}
		System.out.println("Max count is " + maxVal);
		String str = s.substring(start, current);
		return str;
	}

}
