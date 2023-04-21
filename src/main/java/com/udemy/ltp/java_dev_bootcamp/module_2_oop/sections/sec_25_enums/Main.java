package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_25_enums;

import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_25_enums.model.Car;
import static main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_25_enums.model.Car.TrafficLight.*;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("Nissan", 2020);
		// car.drive("RED");
		car.drive(RED);
	}
}
