package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_20_exception_handling.unchecked_exceptions.argument_validation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		User user = new User();

		System.out.println("We are setting up your user account.");

		System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
		// user.setUsername(user.getUsername());
		String username = scanner.nextLine();

		if(username.isBlank()) {
			System.out.println("-> invalid username");
		} else {
			user.setUsername(username);
		}

		System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
		// user.setAge(scanner.nextInt());
		if(scanner.hasNextInt()) {
			int age = scanner.nextInt();

			if(age < 0) {
				System.out.println("\t-> username: " + user.getUsername() + " | age: invalid");
			} else {
				user.setAge(age);

				if(username.isBlank()) {
					System.out.println("\t-> username: invalid" + " | age: " + user.getAge());
				} else {
					System.out.println("\t-> username: " + user.getUsername() + " | age: " + user.getAge());
				}
			}
		} else {
			scanner.nextLine();
		}

		scanner.close();
	}
}