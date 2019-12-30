package com.fis.arrayprogram;

public class MerginTwoSortedArray {

	public static void main(String args[]) {
		MerginTwoSortedArray obj = new MerginTwoSortedArray();
		int[] arr1 = { 1, 3, 5, 7 };
		int n1 = arr1.length;

		int[] arr2 = { 2, 4, 6, 8 };
		int n2 = arr2.length;

		int arr3[] = new int[n1 + n2];
		obj.mergeArray(arr1, arr2, arr3, n1, n2);
	}

	public void mergeArray(int arr1[], int arr2[], int arr3[], int n1, int n2) {

		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			}else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(i<n1) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		
		while(j<n2) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
		
		for(int a:arr3) {
			System.out.println(a);
		}

	}
}
