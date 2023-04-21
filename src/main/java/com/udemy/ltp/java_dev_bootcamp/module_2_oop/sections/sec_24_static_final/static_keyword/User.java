package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_24_static_final.static_keyword;

public class User {
	private static int instanceCount = 0;
	private String firstName;
	private String lastName;

	public User(String firstName, String lastName) {
		instanceCount++;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static int getInstanceCount() {
		return instanceCount;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}