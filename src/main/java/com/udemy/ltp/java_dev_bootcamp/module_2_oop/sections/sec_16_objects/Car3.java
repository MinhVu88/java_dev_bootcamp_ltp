package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

public class Car3 {
	private String make;
	private String color;
	private double price;
	private int year;

	public Car3() {}

	public Car3(String make, String color, double price, int year) {
		this.make = make;
		this.color = color;
		this.price = price;
		this.year = year;
	}

	public String getMake() {
		return this.make;
	}

	public String getColor() {
		return this.color;
	}

	public double getPrice() {
		return this.price;
	}

	public int getYear() {
		return this.year;
	}
}
