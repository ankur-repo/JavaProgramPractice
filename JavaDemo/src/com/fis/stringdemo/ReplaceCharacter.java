package com.fis.stringdemo;

public class ReplaceCharacter {
	
	String str = "Bangalore climate is very good";
	public static void main(String args[]) {
		ReplaceCharacter obj = new ReplaceCharacter();
		String str1 = obj.str.replaceAll(" ", "%20");
		System.out.println(str1);
		
	}

}
