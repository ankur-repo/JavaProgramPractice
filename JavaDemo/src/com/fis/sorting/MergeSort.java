package com.fis.sorting;

public class MergeSort {

	public static void main(String args[]) {
		MergeSort obj = new MergeSort();
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		obj.sort(arr, 0, arr.length - 1);
		for (int a : arr) {
			System.out.print(a + ", ");
		}
	}

	private void sort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}

	}

	private void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int lArr[] = new int[n1];
		int RArr[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			lArr[i] = arr[l + i];
		}

		for (int j = 0; j < n2; j++) {
			RArr[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0, k = l;

		while (i < n1 && j < n2) {
			if (lArr[i] <= RArr[j]) {
				arr[k] = lArr[i];
				i++;
			} else {
				arr[k] = RArr[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = RArr[j];
			j++;
			k++;
		}
	}

}
