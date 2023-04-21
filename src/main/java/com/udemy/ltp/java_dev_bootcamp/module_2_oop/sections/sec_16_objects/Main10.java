package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Car10[] cars = new Car10[] {
			new Car10("Volkswagen", "black", 204.89, 1937, new String[] {"tires", "keys"}),
			new Car10("Tesla", "pink", 25.6, 2005, new String[] {"tires", "keys"}),
			new Car10("Ford Mustang", "red", 365, 1969, new String[] {"tires", "filer"}),
			new Car10("Audi", "grey", 284, 1997, new String[] {"tires", "filer"}),
			new Car10("Porsche", "silver", 492, 1950, new String[] {"tires", "filer", "transmission"})
		};

		Dealership dealership = new Dealership(cars);

		System.out.print(dealership);

		System.out.print("\tpick a car from the list above (0 - 4): ");
		int carIndex = scanner.nextInt();

		System.out.println(dealership.sell(carIndex));

		scanner.close();
	}
}
