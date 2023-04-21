package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_18_immutable_objects;

public class Main {
	public static void main(String[] args) {
		System.out.println("**************** Immutable Object ****************");
		Integer intWrapper1 = 5;
		Integer intWrapper2 = intWrapper1; // SAFE
		System.out.println("Integer #1: " + intWrapper1 + " | Integer #2: " + intWrapper2);

		intWrapper2 = 10;
		System.out.println("Integer #1: " + intWrapper1 + " | Integer #2: " + intWrapper2);

		String str = "eyyo wassup";
		System.out.println("str: " + str);
		str = "fsociety";
		System.out.println("str: " + str);

		System.out.println("\n**************** Mutable Object ****************");
		City city1 = new City("Paris", 2161000);
		City city2 = city1; // DANGEROUS - NOT RECOMMENDED

		city1.setPopulation(2261000);
		city2.setPopulation(2263400);

		System.out.println(
			"city #1 population: " + city1.getPopulation() +
			" | city #2 population: " + city2.getPopulation()
		);

		city2 = new City(city1); // SAFE

		city1.setPopulation(2163400);
		city2.setPopulation(2443400);

		System.out.println(
			"city #1 population: " + city1.getPopulation() +
			" | city #2 population: " + city2.getPopulation()
		);
	}
}
