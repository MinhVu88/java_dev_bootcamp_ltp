package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_24_static_final.static_keyword;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("Liam", "Smith");
		User user2 = new User("Olivia", "Davis");
		User user3 = new User("Ethan", "Martins");

		System.out.println(user1.getFirstName() + " " + user1.getLastName());
		System.out.println(user2.getFirstName() + " " + user2.getLastName());
		System.out.println(user3.getFirstName() + " " + user3.getLastName());
		System.out.println("User Count: " + User.getInstanceCount());
	}
}