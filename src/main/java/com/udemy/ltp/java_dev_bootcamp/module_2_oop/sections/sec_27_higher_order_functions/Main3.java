package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_27_higher_order_functions;

import java.util.Map;
import java.util.HashMap;

public class Main3 {
	public static void main(String[] args) {
		Map<String, Integer> coffeeRatings = new HashMap<>();
		coffeeRatings.put("Starbucks House Blend", 7);
		coffeeRatings.put("Peet's French Roast", 8);
		coffeeRatings.put("Intelligentsia Black Cat", 9);
		coffeeRatings.put("Blue Bottle Three Africas", 10);
		coffeeRatings.put("Philz Mint Mojito Iced Coffee", 8);
		coffeeRatings.put("Camber Coffee Ethiopia Yirgacheffe", 9);
		coffeeRatings.put("Four Barrel Guatemala Finca El Injerto", 7);
		coffeeRatings.put("Heart Coffee Bolivia La Morena", 8);
		coffeeRatings.put("Ritual Coffee Nicaragua La Ilusión", 10);
		coffeeRatings.put("Verve Coffee Roasters El Salvador Finca Kilimanjaro", 9);

		for (int i = 0; i < coffeeRatings.size(); i++) {
			String coffee = (String) coffeeRatings.keySet().toArray()[i];
			Integer rating = coffeeRatings.get(coffee);
			System.out.println("Coffee: " + coffee + " | Rating: " + rating);
		}

		System.out.println("-------------------------------------------------------");

		/*
			- Functional interface: BiConsumer
			- Lambda expression: receives 2 parameters & produces a side-effect
			- Example: (x, y) -> {code}
		*/
		coffeeRatings.forEach((key, value) -> System.out.println("coffee: " + key + " | rating: " + value));
	}
}
