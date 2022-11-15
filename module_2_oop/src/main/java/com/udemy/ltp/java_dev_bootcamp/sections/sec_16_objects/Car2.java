package com.udemy.ltp.java_dev_bootcamp.sections.sec_16_objects;

public class Car2 {
	private String make;
	private String color;
	private double price;
	private int year;

	public Car2() {}

	public Car2(String make, String color, double price, int year) {
		this.make = make;
		this.color = color;
		this.price = price;
		this.year = year;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
