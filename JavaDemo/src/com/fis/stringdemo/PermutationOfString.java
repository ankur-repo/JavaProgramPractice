package com.fis.stringdemo;

public class PermutationOfString {

	StringBuffer sb = new StringBuffer();

	public static void main(String args[]) {
		PermutationOfString obj = new PermutationOfString();
		obj.findPermutation("", "123");
		/*System.out.println(obj.checkPelindrom("PAAP"));
		obj.replace("ABBCDEEFGHIJJK");
		obj.findMaxOccuringChar("ABBCDEEFGHIJJJJKKKKKKK");*/

	}

	public void findPermutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println("word is empty:::" + perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				findPermutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}

	}

	public boolean checkPelindrom(String str) {
		String revreseStr = reverseString(str);
		System.out.println(revreseStr);
		if (str.equals(revreseStr)) {
			return true;
		} else {
			return false;
		}

	}

	public String reverseString(String str) {

		if (str.isEmpty()) {
			return str;
		}

		return reverseString(str.substring(1)) + str.charAt(0);

	}

	public void removeDuplicate(String str) {
		String str1 = str;
		String str4 = "";
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length() - 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					str = str.replace(str.charAt(j), ' ');
				}
			}
		}
		String str2 = str.replace(str.charAt(1), 'B');
		System.out.println(str1);
		System.out.println(":::::" + str);
	}

	public void replace(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i=0;i<str.length(); i++) {
			char c = str.charAt(i);
			int index = str.indexOf(c, i+1);
			if(index==-1) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println("::::"+sb);
	}
	
	
	public void findMaxOccuringChar(String str) {
		int maxCount = 0;
		char ch = ' ';
		for (int i=0; i<str.length(); i++) {
			int count = 1;
			for(int j= i+1; j<str.length(); j++) {
				if(str.charAt(i)== str.charAt(j)) {
					count ++;
				}
			}
			if(count > maxCount) {
				maxCount = count;
				ch = str.charAt(i);
			}
		}
		System.out.println("Max xhar count of"+ch+"==="+maxCount);
	}
	
	public void checkString(String str1, String str2) {
		int l1 = str1.length();
		int l2 = str2.length();
	}
}
