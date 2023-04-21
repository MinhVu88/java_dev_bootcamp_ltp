package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_22_map_collections.hashmap_treemap;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	public static void main(String[] args) {
		// HashMap: unordered collections of key-value pairs
		Map<String, Double> inventory = new HashMap<>();

		inventory.put("Bananas", 2.99);
		inventory.put("Papaya", 5.99);
		inventory.put("Kale", 4.99);
		inventory.put("Apples", 1.99);
		inventory.put("Carrot", 1.49);
		inventory.put("Lime", 0.49);
		inventory.put("Toothpaste", 5.99);
		inventory.put("Zucchini", 5.99);

		System.out.println("The price of Lime: $" + inventory.get("Lime"));
		System.out.println("The price of Zucchini: $" + inventory.get("Zucchini"));
		System.out.println("The price of Kale: $" + inventory.get("Kale"));

		System.out.print(
			"Are Apples for sale? -> " +
			(inventory.containsKey("Apples") ? "Yes!" : "No, sorry!")
		);
	}
}
