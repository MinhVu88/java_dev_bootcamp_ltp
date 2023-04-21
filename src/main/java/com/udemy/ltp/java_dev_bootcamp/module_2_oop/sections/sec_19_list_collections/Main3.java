package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_19_list_collections;

import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		City city1 = new City("Weed", 2873);
		//City city2 = city1;
		City city2 = new City(city1);

		System.out.println("city1.equals(city2) -> " + city1.equals(city2));

		// city2.setPopulation(865);
		// city1.setPopulation(937);

		ArrayList<City> cities = new ArrayList<>();

		cities.add(new City("Weed", 2873));
		cities.add(new City("Mount Shasta", 3223));
		cities.add(new City("Tulelake", 902));
		cities.add(new City("Yreka", 7807));
		cities.add(new City("Fort Jones", 695));
		cities.add(new City("Etna", 678));
		cities.add(new City("Dunsmuir", 1707));
		cities.add(new City("Dorris", 860));
		cities.add(new City("Montague", 1226));

		System.out.println("cities.contains(city1) -> " + cities.contains(city1));
	}
}
