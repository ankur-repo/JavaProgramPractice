package com.fis.collection;

import java.util.ArrayList;
import java.util.Collections;

import com.fis.pojoclass.NoOfWords;

public class ListExample {

	String str = "apple banna apple fruit fruit apple hello hi hi hello hi";

	public static void main(String args[]) {

		int count = 1;
		ListExample listObj = new ListExample();
		ArrayList<NoOfWords> list = new ArrayList<NoOfWords>();
		String strArray[] = listObj.str.split(" ");

		for (String word : strArray) {
			NoOfWords newWordObj = new NoOfWords(word, count);
			if (list.contains(newWordObj)) {
				NoOfWords obj = list.get(list.indexOf(newWordObj));
				obj.setCount(obj.getCount() + 1);
				list.set(list.indexOf(newWordObj), obj);

			} else {
				list.add(newWordObj);
			}
		}

		System.out.println("Before sorting==" + list);
		Collections.sort(list);
		System.out.println("After sorting==" + list);
	}

}
