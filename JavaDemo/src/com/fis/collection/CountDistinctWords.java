package com.fis.collection;

import java.util.HashSet;
import java.util.TreeSet;

import com.fis.pojoclass.NoOfWords;

public class CountDistinctWords {

	String str = "apple banna apple fruit fruit apple hello hi hi hello hi";

	public static void main(String args[]) throws NoSuchFieldException, SecurityException {
		int count = 1;
		CountDistinctWords obj = new CountDistinctWords();
		TreeSet<NoOfWords> hs = new TreeSet<NoOfWords>();
		HashSet<NoOfWords> hashSet =new HashSet<NoOfWords>();
		String strArray[] = obj.str.split(" ");
		for (String word : strArray) {
			// System.out.println(word);
			NoOfWords wordObj = new NoOfWords(word, count);
			if (hs.contains(wordObj)) {
				//hs.add(wordObj);
				//System.out.println("if");
				//hs.add(new NoOfWords(word, count));
				//System.out.println(wordObj.getName());
				for (NoOfWords orgWordObj : hs) {
					if (orgWordObj.equals(wordObj)) {
						int newCount = orgWordObj.getCount() + 1;
						orgWordObj.setCount(newCount);
						hs.add(orgWordObj);
						break;
					}
				}
			} else {
				//System.out.println("else");
				hs.add(new NoOfWords(word, count));
			}

		}
		System.out.println(hs);
		System.out.println(strArray.length);
	}

}
