package com.fis.search;

public class BinarySearch {

	public static void main(String args[]) {
		BinarySearch obj = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40, 50 };
		System.out.println(obj.binarySearchMethod2(arr, 0, arr.length - 1, 10));
	}

	private int binarySearchMethod1(int[] arr, int i, int j, int k) {
		if (j >= i) {
			int mid = (i + j) / 2;
			if (arr[mid] == k) {
				return mid;
			}
			if (arr[mid] > k) {
				return binarySearchMethod1(arr, i, mid - 1, k);
			} else {
				return binarySearchMethod1(arr, mid + 1, j, k);
			}
		}
		return -1;

	}

	private int binarySearchMethod2(int[] arr, int i, int j, int k) {
		while (j >= i) {
			int mid = (i + j) / 2;
			if (arr[mid] == k) {
				return mid;
			}
			if (arr[mid] > k) {
				j = mid - 1;
			} else {
				i = mid + 1;
			}
		}
		return -1;

	}

}
