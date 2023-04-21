package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_27_higher_order_functions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);

		// IMPERATIVE APPROACH
	  for (int i = 0; i < integers.size(); i++) {
	    for (int j = i + 1; j < integers.size(); j++) {
	      if (integers.get(i).compareTo(integers.get(j)) > 0) {
	        int temp = integers.get(i);
	        integers.set(i, integers.get(j));
	        integers.set(j, temp);
	      }
	    }
	  }

		integers.forEach(System.out::println);

		System.out.println("-----------------");

		// THE DECLARATIVE APPROACH
		/*
			- Functional interface: Comparator
			- Lambda expression: receives 2 parameters & returns an integer
			- Example: (x, y) -> {return int}
		*/
		// in ascending order
		// integers.sort((rightValue, leftValue) -> rightValue.compareTo(leftValue));
		integers.sort(Integer::compareTo); // with method reference

		integers.forEach(System.out::println);

		System.out.println("-----------------");

		// in descending order
		// integers.sort((right, left) -> left.compareTo(right));
		integers.sort(Comparator.reverseOrder());

		integers.forEach(System.out::println);
	}
}
