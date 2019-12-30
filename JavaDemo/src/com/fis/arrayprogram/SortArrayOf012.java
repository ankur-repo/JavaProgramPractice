package com.fis.arrayprogram;

public class SortArrayOf012 {
	
	public static void main(String args[]) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
		int size = arr.length;
		sort012(arr, size);
		System.out.println("array is sorted::::::");
		printArray(arr, size);
	}

	private static void printArray(int[] arr, int size) {
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void sort012(int[] arr, int size) {
		int l = 0;
		int mid = 0;
		int h = size-1;
		while(mid <= h) {
			switch(arr[mid]) {
			case 0:
				int temp = arr[l];
				arr[l] = arr[mid];
				arr[mid] = temp;
				l++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2: 
				int temp1 = arr[mid];
				arr[mid] = arr[h];
				arr[h] = temp1;
				h--;
				break;
				
			}
		}
		
	}

}
