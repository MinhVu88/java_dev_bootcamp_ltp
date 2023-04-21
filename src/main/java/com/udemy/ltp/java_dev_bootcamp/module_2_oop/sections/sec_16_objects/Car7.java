package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

import java.util.Arrays;

public class Car7 {
	private String make;
	private String color;
	private double price;
	private int year;
	private String[] parts;

	public Car7() {}

	public Car7(Car7 source) {
		this.make = source.make;
		this.color = source.color;
		this.price = source.price;
		this.year = source.year;
		this.parts = source.parts;
	}

	public Car7(
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

		// why "Arrays.copyOf(parts, parts.length)", but not just "parts"?
		// -> watch vids: 148 (Arrays are Mutable Objects) & 149 (Fixing the Constructor)
		// this.parts = parts;
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
		return parts;
	}

	public void setParts(String[] parts) {
		this.parts = parts;
	}

	public void drive() {
		System.out.println(
			"this " + this.year + " " +
			this.color + " " +
			this.make + " is a beast on the road"
		);
	}
}
