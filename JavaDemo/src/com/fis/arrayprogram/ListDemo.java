package com.fis.arrayprogram;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String args[]) {
		ListDemo obj = new ListDemo();
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();

		list1.add(1);
		list1.add(0);
		list1.add(0);
		list1.add(1);

		list2.add(0);
		list2.add(1);
		list2.add(1);
		list2.add(1);

		list3.add(1);
		list3.add(0);
		list3.add(0);
		list3.add(1);

		list.add(list1);
		list.add(list2);
		list.add(list3);

		obj.countConnection(list);
	}

	public void countConnection(List<List<Integer>> list) {
		int count = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			List<Integer> list1 = list.get(i);
			List<Integer> list2 = list.get(i + 1);

			for (int j = 0; j < list1.size(); j++) {
				int m;
				if (j == 0) {
					m = 0;
				} else {
					m = j - 1;
				}
				if (j + 1 < list1.size() && (list1.get(j) == 1 && list1.get(j + 1) == 1)) {
					count++;
				}
				for (int k = m; k <= j + 1 && k < list2.size(); k++) {
					if (list1.get(j) == 1 && list2.get(k) == 1) {
						count++;
					} 

				}
			}
			/*for(int p = 0 ; p<list2.size();p++) {
				if (p + 1 < list2.size() && (list2.get(p) == 1 && list2.get(p + 1) == 1)) {
					count++;
				}
			}*/
		}
		System.out.println("count is " + count);
	}
}
