package com.fis.tester;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		ArrayList<String> inputData = new ArrayList<String>();
		HashMap<String, String> map = new HashMap<String, String>();
		HashSet<String> set = new HashSet<String>();
		try {
			Scanner in = new Scanner(
					new BufferedReader(new FileReader("input.txt")));

			/* Here we can read in the input file */
			/*
			 * In this example, we're reading all the lines of file `input.txt` and then
			 * ignoring them. You should modify this part of the program to read and process
			 * the input as desired
			 */
			while (in.hasNextLine()) {
				String line = in.nextLine();
				if (!line.isEmpty()) {
					String strArray[] = line.split(",");
					// finding latest version of each API
					if (map.containsKey(strArray[1])) {
						if (strArray[2].compareTo(map.get(strArray[1])) > 0) {
							map.put(strArray[1], strArray[2]);
						}
					} else {
						map.put(strArray[1], strArray[2]);
					}
					inputData.add(line);
				}

			}

			/*
			 * In this example, we're writing `num_lines` to the file `output.txt`. You
			 * should modify this part of the program to write the desired output
			 */
			PrintWriter output = new PrintWriter(
					new BufferedWriter(new FileWriter("output.txt")));
			
			// print apps which are using older version of API
			for (String st : inputData) {
				String strArray[] = st.split(",");
				if (strArray[2].compareTo(map.get(strArray[1])) < 0) {
					if(!set.contains(strArray[0])) {						
						output.println("" + strArray[0]);
						set.add(strArray[0]);
					}

				}
			}
			output.close();
		} catch (IOException e) {
			System.out.println("IO error in input.txt or output.txt");
		}
	}
}
