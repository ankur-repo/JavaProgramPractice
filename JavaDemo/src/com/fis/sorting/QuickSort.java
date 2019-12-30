package com.fis.sorting;

public class QuickSort {

	public static void main(String args[]) {
		int arr[] = { 20, 5, 13, 7, 2, 9, 4 };
		int arr1[] = { 10, 80, 30, 90, 40, 50, 70 };
		int size = arr.length;
		quickSort(arr, 0, size - 1);
		for (int a: arr) {
			System.out.print(a+", ");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int m = partition(arr, low, high);
			quickSort(arr, 0, m-1);
			quickSort(arr, m+1, high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
}
