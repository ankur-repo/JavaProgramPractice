package com.fis.matrixprogram;

public class RotateMatrix {
	public static void main(String args[]) {
		RotateMatrix obj = new RotateMatrix();
		int r = 3;
		int c = 3;
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int arr1[][] = obj.printRotateMatrix(arr, r, c);
		System.out.println("after rotation");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

	private int[][] printRotateMatrix(int[][] arr, int r, int c) {
		int rIndex = 0;
		int cIndex = 0;
		int temp = arr[rIndex+1][cIndex];
		while (rIndex < r && cIndex < c) {
			for (int i = cIndex; i < c ; i++) {
				
				int temp1 = arr[rIndex][i];
				arr[rIndex][i] = temp;
				temp = temp1;
			}
			rIndex++;
			for (int i = rIndex; i < r; i++) {
				int temp1 = arr[i][c - 1];
				arr[i][c - 1] = temp;
				temp = temp1;
			}
			c--;
			if (rIndex < r) {
				for (int i = c - 1; i >= cIndex; i--) {
					int temp1 = arr[r - 1][i];
					arr[r - 1][i] = temp;
					temp = temp1;
				}
				r--;
			}
			if (cIndex < c) {
				for (int i = r - 1; i >= rIndex; i--) {
					int temp1 = arr[i][cIndex];
					arr[i][cIndex] = temp;
					temp = temp1;
				}
				cIndex++;
			}

		}
		return arr;

	}

}
