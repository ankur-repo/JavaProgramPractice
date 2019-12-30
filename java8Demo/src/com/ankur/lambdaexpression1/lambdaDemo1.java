package com.ankur.lambdaexpression1;

import java.util.ArrayList;
import java.util.Collections;

public class lambdaDemo1 {
	public static void main(String args[]) {
		/*FunInterfaceDemo obj = i->System.out.println(i*2);
		obj.show(10);*/
		
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(300);
		ls.add(1000);
		ls.add(100);
		ls.add(500);
		ls.add(400);
		
		Collections.sort(ls,(a,b)->a>b?1:a<b?-1:0);
		System.out.println(ls);
	}

}
