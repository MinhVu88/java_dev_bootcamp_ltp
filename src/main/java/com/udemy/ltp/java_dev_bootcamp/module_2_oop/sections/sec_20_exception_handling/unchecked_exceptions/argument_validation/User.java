package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_20_exception_handling.unchecked_exceptions.argument_validation;

public class User {
	private String username;
	private int age;

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("age must not be negative");
		}

		this.age = age;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		if(username == null || username.isBlank()) {
			throw new IllegalArgumentException("username must not be null or blank");
		}

		this.username = username;
	}
}
