package com.fis.generaljava;

public class PrintSeriesWithoutLoop {

	public static void main(String args[]) {
		PrintSeriesWithoutLoop obj = new PrintSeriesWithoutLoop();
		obj.printNumbers(10);
	}

	private void printNumbers(int num) {
		
		if (num > 0) {
			printNumbers(num - 1);
			System.out.println(num);
		}

		return;

	}

}
