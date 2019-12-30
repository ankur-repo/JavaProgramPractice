package com.fis.arrayprogram;

import java.util.ArrayList;
import java.util.List;

public class InsertElement {

	public static void main(String args[]) {
		InsertElement obj = new InsertElement();
		int arr1[] = { 2, 4, 8, 10, 12, 15 };
		int arr2[] = { 3, 4, 8, 10 };
		int arr3[] = { 4, 8, 14, 40 };
		int arr[] = { 10, 40, 60, 30, 44, 21 };
		int arr4[] = { 0, 0, 1, 0, 3, 0, 5, 0, 6 };
		int array[] = {20, 20, 30, 40, 50, 50, 50}; 
		int index = 3;
		int newValue = 300;

		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = newValue;

		for (int i : arr) {
			System.out.println(i);
		}

		obj.findMaxMinValue(arr);
		obj.findSecondMax(arr);
		obj.findCommonElementInArray(arr1, arr2, arr3);
		obj.moveAllZeroToEnd(arr4);
		obj.findDiffMaxAndMin(arr);
		obj.removeDuplicate(array);
	}

	public void findMaxMinValue(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("Max value is:::" + max + "  min value is:::" + min);
	}

	public void findSecondMax(int arr[]) {
		int max = arr[0];
		int secondmax = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[0]) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax) {
				secondmax = arr[i];
			}

		}
		System.out.println("Second max is :::" + secondmax);

	}

	public void findCommonElementInArray(int arr1[], int arr2[], int arr3[]) {
		int x = 0, y = 0, z = 0;
		List<Integer> commonList = new ArrayList<Integer>();
		while (x < arr1.length && y < arr2.length && z < arr3.length) {
			if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
				commonList.add(arr1[x]);
				x++;
				y++;
				z++;
			} else if (arr1[x] < arr2[y])
				x++;
			else if (arr2[y] < arr3[z])
				y++;
			else
				z++;
		}
		System.out.println("Common elements are==" + commonList);
	}

	public void moveAllZeroToEnd(int arr[]) {
		System.out.println("Before moving zero");
		for (int num : arr) {
			System.out.print(num + ",");
		}
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				i++;
			} else {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j++;
			}

		}
		System.out.println("After moving zero");
		for (int num : arr) {
			System.out.print(num + ",");
		}
	}

	public void findDiffMaxAndMin(int arr[]) {
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Max  is "+max+"  Min is "+min);
		int diff = max-min;
		System.out.println("Difference  between max and min is "+ diff);
	}
	
	public void removeDuplicate(int arr[]) {
	         int index = 1;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[index-1])
	            	arr[index++] = arr[i];
	        }
	        System.out.println("array value is ");
	        for(int num : arr) {
	        	System.out.println(num+",");
	        }
		  System.out.println("Length of array is "+index);
	}

}
