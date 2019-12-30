package com.fis.stringdemo;

public class CountVowelInString {

	public static void main(String args[]) {
		String str = "aAnkur";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
			case 'A':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:

			}

		}

		System.out.println("No of volew  in string::" + str + "= " + count);
	}

}
