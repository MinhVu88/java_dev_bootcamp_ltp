package com.udemy.ltp.java_dev_bootcamp.sections.sec_16_objects;

public class Main1 {
	public static void main(String[] args) {
		// WITHOUT CALLING THE CONSTRUCTOR
		Car1 car_1 = new Car1();

		car_1.make = "Volkswagen";
		car_1.color = "black";
		car_1.year = 1937;
		car_1.price = 204.89;

		System.out.println(
			"Make: " + car_1.make +
			" | Color: " + car_1.color +
			" | Year: " + car_1.year +
			" | Price: $" + car_1.price
		);

		Car1 car_2 = new Car1();

		car_2.make = "Tesla";
		car_2.color = "pink";
		car_2.year = 2005;
		car_2.price = 25.6;

		System.out.println(
			"Make: " + car_2.make +
			" | Color: " + car_2.color +
			" | Year: " + car_2.year +
			" | Price: $" + car_2.price
		);

		// WITH CALLING THE CONSTRUCTOR
		Car1 car_3 = new Car1("Ford Mustang", "red", 365, 1969);

		System.out.println(
			"Make: " + car_3.make +
			" | Color: " + car_3.color +
			" | Year: " + car_3.year +
			" | Price: $" + car_3.price
		);
	}
}
