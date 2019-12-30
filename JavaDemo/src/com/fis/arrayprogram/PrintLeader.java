package com.fis.arrayprogram;

public class PrintLeader {

	public static void main(String args[]) {
		PrintLeader obj = new PrintLeader();
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		obj.printLeaders(arr);
	}

	private void printLeaders(int[] arr) {
		int length = arr.length;
		int max = arr[length - 1];
		System.out.println("Leaders is :::" + max);
		for (int i = length - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println("Leaders is :::" + max);
			}

		}

	}
}
