package com.fis.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Rakuten {

	public static void main(String args[]) {
		String s = "1234567891";

		find(5, 10, s, 10);
	}

	private static void find(int X, long K, String s, int N) {
		TreeSet<String> hs = new TreeSet<>();
		List<String>ls = new ArrayList<>();
		int size = N/X;
		int min = 0;
		int max = X;
		for(int i = 0; i<size;i++) {
			ls.add(s.substring(min, max));
			min = min+X;
			max = max+X;
		}
		ls.forEach(i->System.out.println(i));
		String str1 = s.substring(0, X);
		String str2 = s.substring(X, s.length());
		System.out.println(str1 + "  " + str2);

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				/*System.out.println(str1.charAt(i));
				System.out.println(str2.charAt(j));*/
				String num = ""+str1.charAt(i)+str2.charAt(j);
				//System.out.println(":::"+num);
				hs.add(num);
			}
		}
		
		/*for(int i = 1; i<hs.size();i++) {
			if(i==K) {
				System.out.println(hs.);
			}
			
		}*/
		int count = 1;
		for(String st: hs) {
			if(count ==K) {
				System.out.println("::::::::"+st);
			}
			count++;
		}
		
		//System.out.println(hs.ge);
	}
}
