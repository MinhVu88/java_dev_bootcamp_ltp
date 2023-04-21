package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_22_map_collections.map_equality;

import java.util.Objects;

public class Contact {
	private String name;
	private int age;

	public Contact(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Contact(Contact source) {
		this.name = source.name;
		this.age = source.age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}

		if(!(o instanceof Contact contact)) {
			return false;
		}

		return Objects.equals(name, contact.name) && age == contact.age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}
