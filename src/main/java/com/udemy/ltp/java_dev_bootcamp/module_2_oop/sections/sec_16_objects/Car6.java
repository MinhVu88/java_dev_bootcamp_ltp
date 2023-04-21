package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

public class Car6 {
	private String make;
	private String color;
	private double price;
	private int year;

	public Car6() {}

	// a "copy" constructor
	public Car6(Car6 source) {
		this.make = source.make;
		this.color = source.color;
		this.price = source.price;
		this.year = source.year;
	}

	public Car6(String make, String color, double price, int year) {
		this.make = make;
		this.color = color;
		this.price = price;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void drive() {
		System.out.println(
			"this " + this.year + " " +
			this.color + " " +
			this.make + " is a beast on the road"
		);
	}
}
