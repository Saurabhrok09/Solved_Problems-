package com.test.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Big black bug bit a big black dog on his a big black nose";
		string = string.toLowerCase();
		optimize(string);
		// no_Optimize(string);

	}

	public static void optimize(String string) {
		String[] arrStr = string.split(" ");
		int len = arrStr.length;
		Map<String, Integer> mp = new HashMap<>();

		for (String s : arrStr) {
			mp.put(s, mp.getOrDefault(s, 0) + 1);
		}
		System.out.println(mp);
		for (Entry<String, Integer> s : mp.entrySet()) {
			if (s.getValue() > 1) {
				System.out.println(s.getKey());
			}
		}

	}

	public static void no_Optimize(String string) {
		String[] arrStr = string.split(" ");
		int len = arrStr.length;
		for (int i = 0; i < len; i++) {
			int count = 1;
			for (int j = i + 1; j < len; j++) {
				if (arrStr[i].equals(arrStr[j])) {
					count++;
					// j = 0;
					arrStr[j] = "0";

				}

			}
			if (arrStr[i] != "0" && count > 1) {
				System.out.println(arrStr[i]);
			}

		}
	}

}
