package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_18_immutable_objects;

public class City {
	private String name;
	private long population;

	public City(String name, long population) {
		this.name = name;
		this.population = population;
	}

	public City(City source) {
		this.name = source.name;
		this.population = source.population;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return this.population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
}
