package com.fis.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrrayListDemo {
	
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>(5);
		int arr[] = new int[5];
		al.add("Aman");
		al.add("Ankur");
		al.add("Bittu");
		al.add("Ankur");
		al.add("Bittu");
		al.add("Ankur");	
		System.out.println(arr.length);
		
		
		System.out.println(al.size());
		System.out.println("Before deletion::::"+al);
		al.set(4, "bittttttt");
		System.out.println(al.remove("abc"));
		//al.add(4,"bittttttt");
		System.out.println("After Add::::"+al);
		System.out.println("Before deletion::::"+al.size());
		al.remove(4);
		System.out.println("After deletion::::"+al);
		System.out.println("After deletion::::"+al.size());
	}

}
