package com.fis.arrayprogram;

public class PrintArrayAfterRotation {

	int arr[] = { 1, 2, 3, 4 };

	public static void main(String args[]) {
		PrintArrayAfterRotation obj = new PrintArrayAfterRotation();
		obj.printAfterRotation(obj.arr.length, 3);
		/*int rotateArray[] = obj.rotateByGivenNumber(obj.arr, 4);
		for (int a : rotateArray) {
			System.out.println(a);
		}*/
	}

	private int[] rotateByGivenNumber(int arr[], int d) {
		for (int i = 0; i < d; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
		return arr;

	}

	private void printAfterRotation(int n, int d) {
		for (int i = n-d; i < n; i++) {
			System.out.println(arr[i]);
			if (i == n - 1) {
				for (int j = 0; j < n-d; j++) {
					System.out.println(arr[j]);
				}
			}
		}

	}
}
