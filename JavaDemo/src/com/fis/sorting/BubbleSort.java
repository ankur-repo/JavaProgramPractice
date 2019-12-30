package com.fis.sorting;

public class BubbleSort {

	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 90, 12, 22, 11 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			for (int a : arr)
				System.out.print(a + ", ");
			System.out.println("\n");
		}
	}
}
