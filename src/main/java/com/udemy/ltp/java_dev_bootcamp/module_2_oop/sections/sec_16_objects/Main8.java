package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

public class Main8 {
	public static void main(String[] args) {
		Car8 car_12_1 = new Car8(
			"Aston Martin",
			"black",
			493,
			2014,
			new String[] {"tires", "keys"}
		);

		Car8 car_12_2 = new Car8(car_12_1);

		car_12_1.drive();
		car_12_2.drive();
	}
}
