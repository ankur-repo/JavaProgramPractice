package com.fis.arrayprogram;

public class RemoveDuplicateElement {

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 20, 40, 20, 50,50, 40, 60 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < arr.length - 1; k++) {
						arr[k] = arr[k + 1];
					}
				}
			}
		}

		System.out.println("after duplicate remove");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
