package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_26_inheritance.product;

public class Pants extends Product {
	// private double price;
	// private String color;
	// private String brand;
	private int waist;
	private int length;

	public Pants(
		double price,
		String color,
		String brand,
		int waist,
		int length
	) {
		// super() calls the super class's constructor to update the inherited fields
		super(price, color, brand);
		this.waist = waist;
		this.length = length;
	}

	public int getWaist() {
		return this.waist;
	}

	public void setWaist(int waist) {
		this.waist = waist;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void fold() {
		super.fold();

		System.out.println(
			"1. Hold pants upright." +
			"\n2. Fold 1 leg over the other." +
			"\n3. Fold pants from bottom in thirds."
		);
	}

	@Override
	public void wear() {
		System.out.println("the " + this.waist + ", " + this.length + " pants look great on you");
	}

	/*
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	*/
}
