package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_26_inheritance.product;

public class Shirt extends Product {
	// private double price;
	// private String color;
	// private String brand;
	private Size size;
	public enum Size {SMALL, MEDIUM, LARGE}

	public Shirt(
		double price,
		String color,
		String brand,
		Size size
	) {
		super(price, color, brand);
		this.size = size;
	}

	public Size getSize() {
		return this.size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public void fold() {
		super.fold();

		System.out.println(
			"1. Lay a shirt on a flat surface." +
			"\n2. Fold it sideways." +
			"\n3. Bring sleeves in." +
			"\n4. Fold from bottom up."
		);
	}

	@Override
	public void wear() {
		System.out.println("this " + this.size + " shirt suits you well");
	}

	@Override
	public String toString() {
		return "SHIRT: " +
						this.size + " " +
						super.getBrand() + " " +
						super.getColor() + " " +
						super.getPrice();
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
