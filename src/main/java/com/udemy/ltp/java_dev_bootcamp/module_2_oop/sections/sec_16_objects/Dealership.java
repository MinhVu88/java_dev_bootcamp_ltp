package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

// import java.util.Arrays;

public class Dealership {
	private Car10[] cars;

	public Dealership(Car10[] cars) {
		// this.cars = cars;
		// this.cars = Arrays.copyOf(cars, cars.length);

		// deep copy
		this.cars = new Car10[cars.length];

		for(int i = 0; i < this.cars.length; i++) {
			this.cars[i] = new Car10(cars[i]);
		}
	}

	public String toString() {
		StringBuilder carCollection = new StringBuilder();

		for(int i = 0; i < cars.length; i++) {
			carCollection.append("car #").append(i).append(" -> ");

			String carInfo = this.cars[i].toString();

			carCollection.append(carInfo).append("\n");
		}

		return carCollection.toString();
	}

	public String sell(int index) {
		return "\t=> thank you buying " + this.cars[index].getMake() + ". It's a beast on the road";
	}
}
