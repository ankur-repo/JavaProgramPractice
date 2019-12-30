package com.ankur.collectionstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod {

	public static void main(String args[]) {
		StreamMethod obj = new StreamMethod();
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		obj.printFibnocai(10);
	}
	
	public void printFibnocai(int count){
		Stream.iterate(new int[] {0,1}, t->new int[] {t[1],t[0]+t[1]})
		.limit(count)
		.map(n->n[0])
		.forEach(System.out::println);
		
	}
}
