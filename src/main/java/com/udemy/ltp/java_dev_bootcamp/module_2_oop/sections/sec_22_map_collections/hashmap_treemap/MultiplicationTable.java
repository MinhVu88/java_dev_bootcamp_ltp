package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_22_map_collections.hashmap_treemap;

import java.util.Map;
import java.util.TreeMap;

public class MultiplicationTable {
	public static void main(String[] args) {
		// TreeMap: ordered collections of key-value pairs.
		// TreeMap sorts entries in ascending key order.
		// The time to retrieve data depends on the tree depth.
		Map<Integer, Integer> multiplicationTable = new TreeMap<>();

		int multiplier = 5;

		multiplicationTable.put(1, multiplier * 1);
		multiplicationTable.put(2, multiplier * 2);
		multiplicationTable.put(3, multiplier * 3);
		multiplicationTable.put(4, multiplier * 4);
		multiplicationTable.put(5, multiplier * 5);
		multiplicationTable.put(6, multiplier * 6);
		multiplicationTable.put(7, multiplier * 7);
		multiplicationTable.put(8, multiplier * 8);
		multiplicationTable.put(9, multiplier * 9);
		multiplicationTable.put(10, multiplier * 10);

		System.out.println("What is 4 multiplied by " + multiplier + "? -> " + multiplicationTable.get(4));
		System.out.println("What is 7 multiplied by " + multiplier + "? -> " + multiplicationTable.get(7));
		System.out.println("What is 3 multiplied by " + multiplier + "? -> " + multiplicationTable.get(3));

		System.out.println(
			"Does the table reach 20? -> " +
			(multiplicationTable.containsKey(20) ? "Yes!" : "No, sorry!")
		);
	}
}
