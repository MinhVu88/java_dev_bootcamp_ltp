package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_27_higher_order_functions;

import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		System.out.println("\n--------------------------[ forEach ]-----------------------------");
		List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");
		// usernames.stream().map(username -> username.toUpperCase()).forEach(System.out::println);
		usernames.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("\n--------------------------[ toList ]-----------------------------");
		List<String> upperUsernames = usernames.stream().map(String::toUpperCase).toList();
		upperUsernames.forEach(System.out::println);

		System.out.println("\n--------------------------[ reduce ]-----------------------------");
		/* reduce()
			- Functional interface: BinaryOperator
			- Lambda expression: receives 2 parameters & returns a value of the same type
			- Example: (x, y) -> {return value}
		*/
		List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);
		// Double totalEarnings = earnings.stream().reduce(0.00, (x, y) -> x + y);
		Double totalEarnings = earnings.stream().reduce(0.00, Double::sum);
		System.out.println("total earnings: $" + totalEarnings);

		System.out.println("\n--------------------------[ reduce ]-----------------------------");
		List<Double> expenses = Arrays.asList(2.50, 4.00, 5.50, 2.00, 5.50, 2.00);
		Double fundsRemaining = expenses.stream().reduce(100.00, (x, y) -> x - y);
		System.out.println("\nYou still have $" + fundsRemaining);

		System.out.println("\n--------------------------[ findFirst ]-----------------------------");
		List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");

		String result = aisles.stream()
													.filter(aisle -> aisle.equalsIgnoreCase("coffee"))
													.findFirst()
													.orElse(null);

		System.out.println(
			"\nDo you guys sell coffee? -> " +
			(result == null ? "Nope" : "Yes, we do")
		);

		System.out.println("\n--------------------------[ count ]-----------------------------");
		List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
		int repeatedNumber = 1;
		long count = numbers.stream().filter(num -> num == repeatedNumber).count();
		System.out.println("\nHow many times does the number " + repeatedNumber + " repeat? -> " + count);

		System.out.println("\n--------------------------[ The end ]-----------------------------");
	}
}
