package com.ankur.collectionstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String args[]) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(100);
		ls.add(800);
		ls.add(451);
		ls.add(400);
		ls.add(703);
		ls.add(500);

		System.out.println("Before filter:::" + ls);
		List<Integer> list1 = ls.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("After filter:::" + list1);
		List<Integer> list2 = ls.stream().map(i -> i + 1).collect(Collectors.toList());
		System.out.println("After map:::" + list2);
		List<Integer> list3 = ls.stream().sorted().collect(Collectors.toList());
		System.out.println("After sorting:::" + list3);
		List<Integer> list4 = ls.stream().sorted((a, b) -> a > b ? -1 : a < b ? 1 : 0).collect(Collectors.toList());
		System.out.println("After custom sorting:::" + list4);
		// list4.forEach(System.out::println);
		list4.parallelStream().forEach(i -> System.out.println("parallel stream" + i));
		list4.parallelStream().forEachOrdered(i -> System.out.println("ordered parallel stream" + i));
		Optional<Integer> sum = list4.stream().reduce((ans, i) -> ans + i);
		System.out.println("reduce on list4  " + sum.get());
		Optional<Integer> max = list4.stream().max((a, b) -> a > b ? 1 : a < b ? -1 : 0);
		Optional<Integer> min = list4.stream().min((a, b) -> a > b ? 1 : a < b ? -1 : 0);
		System.out.println("max value is::::"+max);
		System.out.println("min value is::::"+min);
		Optional<Integer> max1 = list4.stream().max((a, b) -> a > b ? -1 : a < b ? 1 : 0);
		Optional<Integer> min1 = list4.stream().min((a, b) -> a > b ? -1 : a < b ? 1 : 0);
		System.out.println("decending max value is::::"+max1);
		System.out.println("decending min min value is::::"+min1);
		

		
	}

}
