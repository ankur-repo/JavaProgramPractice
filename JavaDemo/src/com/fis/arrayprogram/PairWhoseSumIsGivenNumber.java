package com.fis.arrayprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PairWhoseSumIsGivenNumber {

	public static void main(String args[]) {
		PairWhoseSumIsGivenNumber obj = new PairWhoseSumIsGivenNumber();
		int arr[] = { 1, 4, 45, 6, 10, -8, 24 };
		int sum = 16;
		 obj.findPair(arr, sum);
		//obj.findPair1(arr, sum);
	}

	private void findPair1(int[] arr, int sum) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if (hs.contains(temp)) {
				System.out.println("pair is::: " + arr[i] + "," + temp);
			}
			hs.add(arr[i]);
		}

	}

	private void findPair(int[] arr, int sum) {
		Arrays.sort(arr);
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			if (arr[l] + arr[r] == sum) {
				System.out.println("pair is::: " + arr[l] + "," + arr[r]);
				l++;
				r--;
			} else if (arr[l] + arr[r] < sum) {
				l++;
			} else if (arr[l] + arr[r] > sum) {
				r--;
			}
		}

	}

}
