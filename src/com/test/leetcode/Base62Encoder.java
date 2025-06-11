package com.test.leetcode;

public class Base62Encoder {
	public static void main(String[] args) {

		String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int num = 16;
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			sb.append(chars.charAt(num % 62));
			num /= 62;
		}

		System.out.println(sb.reverse().toString());
	}
}
