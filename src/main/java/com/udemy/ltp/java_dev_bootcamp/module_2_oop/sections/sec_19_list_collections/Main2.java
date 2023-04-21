package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_19_list_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<>();
		List<Integer> arrayList = new ArrayList<>();

		for(int i = 0; i < 11_000_000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}

		System.out.println("***************** FETCHING DATA *****************");
		long start = System.currentTimeMillis();
		linkedList.get(4_500_000);
		System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");
		start = System.currentTimeMillis();
		arrayList.get(4_500_000);
		System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("***************** FIRST / LAST INDEX *****************");
		start = System.currentTimeMillis();
		linkedList.get(0);
		linkedList.get(linkedList.size() - 1);
		System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");
		start = System.currentTimeMillis();
		arrayList.get(0);
		arrayList.get(arrayList.size() - 1);
		System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("***************** INSERTION FROM MIDDLE *****************");
		start = System.currentTimeMillis();
		linkedList.add(5, 121); // insert 121 at index 5
		System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");
		start = System.currentTimeMillis();
		arrayList.add(5, 121);  // insert 121 at index 5
		System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("***************** INSERTION *****************");
		start = System.currentTimeMillis();
		linkedList.add(121);
		System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");
		start = System.currentTimeMillis();
		arrayList.add(121);
		System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("***************** REMOVAL *****************");
		start = System.currentTimeMillis();
		linkedList.remove(400);
		System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");
		start = System.currentTimeMillis();
		arrayList.remove(400);
		System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("***************** UPDATES *****************");
		start = System.currentTimeMillis();
		linkedList.set(4_500_000, 5);
		System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");
		start = System.currentTimeMillis();
		arrayList.set(4_500_000, 5);
		System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");
	}
}
