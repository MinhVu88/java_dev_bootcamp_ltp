package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.challenges.sec_17_objects;

public class Store {
	private final Movie[] movies;

	public Store() {
		this.movies = new Movie[10];
	}

	public Movie getMovie(int index) {
		return new Movie(this.movies[index]);
	}

	public void setMovie(int index, Movie movie) {
		this.movies[index] = new Movie(movie);
	}

	public String toString() {
		StringBuilder temp = new StringBuilder();

		for (Movie movie : movies) {
			temp.append(movie.toString()).append("\n");
		}

		return temp.toString();
	}
}
