package com.fis.stringdemo;

public class RotateString {
	public static void main(String args[]) {
		RotateString obj = new RotateString();
		String str = "abcdefg";
		obj.rotate(str,6);
	}

	private void rotate(String str, int d) {
		String str1 = (str+str.substring(0, d)).substring(d);
		System.out.println(str1);
		
	}

}
