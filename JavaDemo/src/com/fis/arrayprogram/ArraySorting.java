package com.fis.arrayprogram;

public class ArraySorting {

	public static void main(String args[]) {
		ArraySorting obj = new ArraySorting();
		int arr[] = { 100, 20, 50, 70, 10, 5 };
		String strArray[] = { "Bittu","Ankur","Vijay","Sunny","Alok"};
		System.out.println("befor sorting int array");
		for(int i: arr) {
			System.out.print(i+",");
		}
		obj.sortArray(arr);
		
		System.out.println("befor sorting String  array");
		for(String i: strArray) {
			System.out.print(i+",");
		}
		obj.sortStringArray(strArray);
	}
	
	
	public void sortArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if(arr[i]>arr[j]) {
					int a = arr[i];
					arr[i]= arr[j];
					arr[j]=a;
				}
			}
		}
		System.out.println("after sorting int array");
		for(int i: arr) {
			System.out.print(i+",");
		}
	}
	
	public void sortStringArray(String arr[]) {
		for(int i =0; i<arr.length;i++) {
			for (int j= i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String str = arr[i];
					arr[i] = arr[j];
					arr[j] = str;
				}
			}
		}
		System.out.println("after sorting string array");
		for(String i: arr) {
			System.out.print(i+",");
		}
	}
}
