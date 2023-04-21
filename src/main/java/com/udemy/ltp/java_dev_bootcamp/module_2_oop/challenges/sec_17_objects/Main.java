package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.challenges.sec_17_objects;

import java.util.Scanner;

public class Main {
	private static final Store store = new Store();

	public static void main(String[] args) {
		Movie[] movies = new Movie[] {
			new Movie("The Shawshank Redemption", "BlueRay", 9.2),
			new Movie("The Godfather", "BlueRay", 9.1),
			new Movie("The Godfather: Part II", "DVD", 9.0),
			new Movie("12 Angry Men", "DVD", 8.9),
			new Movie("The Dark Knight", "BlueRay", 9.0),
			new Movie("Schindler's List", "DVD", 8.9),
			new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
			new Movie("Pulp Fiction", "DVD", 8.8),
			new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
			new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
		};

		for (int i = 0; i < movies.length; i++) {
			store.setMovie(i, movies[i]);
		}

		printStore();
		input();
	}

	private static void input() {
		Scanner scanner = new Scanner(System.in);

		String reply = "y";

		while(reply.equalsIgnoreCase("y")) {
			System.out.print("Please choose an integer between 0 - 9: ");
			int digit = scanner.nextInt();

			Movie movie = store.getMovie(digit);

			System.out.print("Set a new rating for " + movie.getName() + ": ");
			double newRating = scanner.nextDouble();
			movie.setRating(newRating);

			store.setMovie(digit, movie);
			printStore();

			System.out.print("to edit another rating, type 'Y/y' -> ");
			reply = scanner.next();
		}

		scanner.close();
	}

	private static void printStore() {
		System.out.println("********************************MOVIE STORE*******************************");
		System.out.println(store);
	}
}
