package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

public class Main9 {
	public static void main(String[] args) {
		Car9 car_13_1 = new Car9(
			"Land Rover",
			"white",
			576,
			1996,
			new String[] {"tires", "keys"}
		);

		String[] carParts = car_13_1.getParts();
		carParts[0] = "Filter";

		Car9 car_13_2 = new Car9(car_13_1);
		car_13_2.setParts(carParts);

		car_13_1.drive();
		car_13_2.drive();

		Car9 car_14 = new Car9(
			"Dodge",
			"black",
			807,
			1927,
			new String[] {"tires", "keys"}
		);

		System.out.println(car_14);
	}
}
