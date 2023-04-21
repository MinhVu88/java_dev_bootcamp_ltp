package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_27_higher_order_functions;

import java.util.Arrays;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

		/* filter()
			- Functional interface: Predicate
			- Lambda expression: receives 1 parameter & produces a boolean
			- Example: x -> {return boolean}
		*/
		/* map()
			- Functional interface: Function
			- Lambda expression: receives 1 parameter & returns any value
			- Example: x -> {return value}
		*/
		prices.stream()
					.filter(price -> price > 100)
					.map(price -> price - 20)
					.sorted(Double::compareTo)
					.map(price -> "$" + price)
					.forEach(System.out::println);
	}
}