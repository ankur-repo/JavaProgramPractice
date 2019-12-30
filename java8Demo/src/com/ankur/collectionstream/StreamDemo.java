package com.ankur.collectionstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(20);
		list.add(30);
		list.add(19);
		
		System.out.println("List before filter:::" + list);
		List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> marks = list.stream().map(i -> i + 5).collect(Collectors.toList());
		List<Integer> sortedMarks = list.stream().sorted((a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0)
				.collect(Collectors.toList());
		
		System.out.println("List after filter:::" + list1);
		System.out.println("List after filter:::" + marks);
		System.out.println(sortedMarks);
		
		sortedMarks.stream().forEach(System.out::println);
		System.out.println("::::::::::::");
		
		sortedMarks.parallelStream().forEachOrdered(System.out::println);
		Optional<Integer> sum = list.stream().map(i -> i + 10).reduce((ans, i) -> ans + i);
		System.out.println("reduce value:::"+sum);
		
		Optional<Integer> maxEle = list.stream().max((a, b) -> (a < b) ? -1 : (a > b) ? 1 : 0);
		Optional<Integer> minEle = list.stream().min((a, b) -> (a < b) ? -1 : (a > b) ? 1 : 0);
		Optional<Integer> maxEle1 = list.stream().max((a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0);
		Optional<Integer> minEle1 = list.stream().min((a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0);
		System.out.println(list);
		System.out.println("accending maxElement= "+maxEle.get());
		System.out.println("accending minElement= "+minEle.get());
		System.out.println("decending maxElement= "+maxEle1.get());
		System.out.println("decending minElement= "+minEle1.get());
		
		list.stream().forEach(i->System.out.println(i));
		
	}

}
