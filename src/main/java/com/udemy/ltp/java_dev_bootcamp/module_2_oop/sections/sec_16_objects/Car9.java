package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

import java.util.Arrays;

public class Car9 {
	private String make;
	private String color;
	private double price;
	private int year;
	private String[] parts;

	public Car9() {}

	public Car9(Car9 source) {
		this.make = source.make;
		this.color = source.color;
		this.price = source.price;
		this.year = source.year;
		this.parts = Arrays.copyOf(source.parts, source.parts.length);
	}

	public Car9(
		String make,
		String color,
		double price,
		int year,
		String[] parts
	) {
		this.make = make;
		this.color = color;
		this.price = price;
		this.year = year;
		this.parts = Arrays.copyOf(parts, parts.length);
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

	public String[] getParts() {
		// explained in vid 151 (Fixing the Getter)
		// return parts;
		return Arrays.copyOf(this.parts, this.parts.length);
	}

	public void setParts(String[] parts) {
		// explained in vid 152 (Fixing the Setter)
		// this.parts = parts;
		this.parts = Arrays.copyOf(parts, parts.length);
	}

	public void drive() {
		System.out.println(
			"this " + this.year + " " +
			this.color + " " +
			this.make + " is a beast on the road"
		);
	}

	// vid 154 (toString)
	public String toString() {
		return "make: " + make +
					 " | color: " + color +
					 " | price: " + price +
					 " | year: " + year +
					 " | parts: " + Arrays.toString(parts);
	}
}
