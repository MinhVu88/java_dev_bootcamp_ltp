// unchecked exceptions are also known as runtime exceptions
package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_20_exception_handling.unchecked_exceptions.common_exceptions;

import java.util.Scanner;

public class CommonExceptions {
	public static void main(String[] args) {
		System.out.println("\t[ ArrayIndexOutOfBounds ]");
		int[] grades = new int[] {96, 65, 56, 86};
		// System.out.println(grades[4]);
		System.out.println(grades[3]);

		System.out.println("\t[ NullPointerException ]");
		String[] names = new String[7];
		names[0] = "John";
		names[1] = "Jim";
		names[2] = "Joe";

		for(String name : names) {
			// System.out.println(name.toUpperCase());

			if(name != null) {
				System.out.println(name.toUpperCase());
			}
		}

		System.out.println("\t[ InputMismatchException ]");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a random integer: ");
		// scanner.nextInt();

		if(scanner.hasNextInt()) {
			int value = scanner.nextInt();
			System.out.println("the random int: " + value);
		} else {
			System.out.println("invalid input");
			scanner.next();
		}

		scanner.close();
	}
}