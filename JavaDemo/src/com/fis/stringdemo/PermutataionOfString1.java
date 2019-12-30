package com.fis.stringdemo;

public class PermutataionOfString1 {

	public static void main(String args[]) {
		PermutataionOfString1 obj = new PermutataionOfString1();
		String str = "abc";
		obj.printPermutation(str, "");

	}

	private void printPermutation(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			printPermutation(str.substring(0, i) + str.substring(i + 1), res + str.charAt(i));
		}

	}

}
