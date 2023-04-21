package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_26_inheritance;

import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_26_inheritance.product.Pants;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_26_inheritance.product.Product;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_26_inheritance.product.Shirt;

public class Main {
	// NOT RECOMMENDED
	public static void sellPants(Pants pants) {
		System.out.println(
			"selling the $" + pants.getPrice() +
			" " + pants.getBrand() + " pants"
		);
	}

	public static void sellShirt(Shirt shirt) {
		System.out.println(
			"selling the $" + shirt.getPrice() +
			" " + shirt.getBrand() + " shirt"
		);
	}

	// RECOMMENDED
	public static void sell(Product product) {
		System.out.println(
			"selling the $" + product.getPrice() +
			" " + product.getBrand() + " " +
			product.getClass().getSimpleName().toLowerCase()
		);

		product.wear();
	}

	public static void main(String[] args) {
		/*
			- An abstract class can't be instantiated, but it can be inherited/subclassed.
			- When an abstract class is inherited, the subclass usually implements
			  all the abstract methods in its super class.
			- If the subclass doesn't do so, then it must also be declared abstract.
		*/
		// Product product = new Product(29.99, "Black", "some brand");

		// Shirt shirt = new Shirt();
		// shirt.setSize(Size.SMALL);
		// shirt.setBrand("NIKE");
		// shirt.setPrice(49.99);
		// shirt.setColor("BLUE");
		Shirt shirt = new Shirt(10.99, "Red", "Nike", Shirt.Size.SMALL);
		shirt.fold();
		sellShirt(shirt);
		sell(shirt);

		System.out.println();

		// Pants pants = new Pants();
		// pants.setWaist(32);
		// pants.setLength(32);
		// pants.setColor("BLACK");
		// pants.setPrice(79.99);
		// pants.setBrand("LEVI'S");
		Pants pants = new Pants(49.99, "Black", "Levi's", 32, 32);
		pants.fold();
		sellPants(pants);
		sell(pants);

		System.out.println();

		System.out.println(shirt);
	}
}
