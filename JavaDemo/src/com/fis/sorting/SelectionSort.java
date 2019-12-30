package com.fis.sorting;

public class SelectionSort {

	public static void main(String args[]) {
		int arr[] = { 64, 25, 12, 22, 11 };

		for (int i = 0; i < arr.length-1; i++) {
			int pos = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[pos]) {
					pos = j;
				}
			}
				int temp = arr[pos];
				arr[pos] = arr[i];
				arr[i] = temp;
			
			for (int a : arr)
				System.out.print(a + ", ");
			System.out.println("\n");

		}
	}

}
