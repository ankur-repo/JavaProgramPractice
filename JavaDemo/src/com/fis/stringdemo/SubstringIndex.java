package com.fis.stringdemo;

public class SubstringIndex {

	public static void main(String args[]) {
		String str = "ABGDEFBCX";
		String str1 = "BC";

	//	System.out.println("Index of substring is::: " + findIndex(str, str1));
		
		System.out.println("Index of substring is by other method::: " + findIndex1(str, str1));
	}

	private static int findIndex(String str, String str1) {
		for (int i = 0; i <= str.length(); i++) {
			String tempStr = str.substring(i, i + str1.length());
			System.out.println(tempStr);
			if (tempStr.equals(str1)) {
				return i;
			}
		}
		return -1;
	}

	private static int findIndex1(String str, String str1) {
		int j = 0;
		while (j <= str.length() - str1.length()) {
			String tempStr = "";
			for (int i = j; i < j + str1.length(); i++) {
				tempStr += str.charAt(i);

			}
			System.out.println(tempStr);
			if (tempStr.equals(str1)) {
				return j;
			}
			j++;
		}
		return -1;
	}

}
