package com.fis.filereadandwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
	public static void main(String args[]) {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		try {
			fi = new FileInputStream("C://PayNet_Project/abc.txt");
			fo = new FileOutputStream("C://PayNet_Project/xyz.txt");
			int ch = fi.read();
			while (ch != -1) {
				fo.write(ch);
				ch = fi.read();
			}
			System.out.println("Read write completed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
