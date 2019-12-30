package com.fis.arrayprogram;

public class PlaceAllZeroTOOneSide {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 5, 6, 0, 0, 7, 0, 9, 0 };
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=0 ) {
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
