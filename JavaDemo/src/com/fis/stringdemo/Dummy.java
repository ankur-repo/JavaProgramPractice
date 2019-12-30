package com.fis.stringdemo;

public class Dummy {

	String str = "123";
	public static void main(String args[]) {
		Dummy obj = new Dummy();
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb1 = new StringBuffer("abc");
		sb.equals(sb1);
		System.out.println(":::"+obj.str.substring(0, 0));
	}
}
