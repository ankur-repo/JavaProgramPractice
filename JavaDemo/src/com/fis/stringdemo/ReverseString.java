package com.fis.stringdemo;

public class ReverseString {

	String revStr = "";

	public static void main(String args[]) {
		ReverseString obj = new ReverseString();
		String str = "ANKUR";
		System.out.println(obj.reverseString(str));
	}

	public String reverseString(String str) {
		/*System.out.println("begning");
		if (str.length() > 0) {
			revStr = revStr + str.charAt(str.length() - 1);
			reverseString(str.substring(0, str.length() - 1));
		}
		System.out.println("end");
		return revStr;*/
		if (str.isEmpty()) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
	}

}
