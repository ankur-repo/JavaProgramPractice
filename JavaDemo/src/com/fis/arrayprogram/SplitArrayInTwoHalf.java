package com.fis.arrayprogram;

public class SplitArrayInTwoHalf {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 1, 5, 5 };
		int n = arr.length;
		System.out.println("Split at index::::" + findSplitPoint(arr, n));
		//System.out.println("Split at index::::" + printTwoParts(arr, n));
	}

	public static int findSplitPoint(int arr[], int n) {
		int leftSum = 0;
		for (int i = 0; i < n; i++)
			leftSum += arr[i];
		int rightSum = 0;
		for (int i = n - 1; i >= 0; i--) {
			rightSum += arr[i];
			leftSum -= arr[i];
			if (rightSum == leftSum)
				return i;
		}
		return -1;
	}

	private static int printTwoParts(int[] arr, int n) {
		int mid = n / 2;
		int firstHalf = 0;
		int secondHalf = 0;
		for (int i = 0; i < mid; i++) {
			firstHalf = firstHalf + arr[i];
		}

		System.out.println("firstHalf:::" + firstHalf);

		for (int j = mid; j < n; j++) {
			secondHalf = secondHalf + arr[j];
		}

		System.out.println("secondHalf:::" + secondHalf);

		if (firstHalf < secondHalf) {
			int mid1 = n / 2;
			int i = 0;
			while (mid1 < n) {
				firstHalf = firstHalf + arr[mid1];
				secondHalf = secondHalf - arr[mid1];
				if (firstHalf == secondHalf) {
					System.out.println("index is " + (mid1));
					return mid1;
				}
				mid1++;
			}
			return -1;
		} else {

		}
		return -1;
	}
}
