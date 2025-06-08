package com.test.array;

public class RevStringBy2Poniters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		System.out.println(mtd(str));

	}

	public static boolean mtd(String str) {
		int srt = 0, end = str.length() - 1;
		while (srt < end) {
			if (str.charAt(srt) != str.charAt(end)) {
				return false;

			}
			srt++;
			end--;
		}
		return true;
	}
}
