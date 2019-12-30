package com.ankur.collectionstream;

import java.util.stream.IntStream;

public class Print1To10 {
	public static void main(String args[]) {
		IntStream.range(0, 10).forEach(i->System.out.println(i));
	}

}
