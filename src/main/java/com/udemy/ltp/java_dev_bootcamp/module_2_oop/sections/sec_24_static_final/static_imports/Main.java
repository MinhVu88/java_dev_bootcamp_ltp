package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_24_static_final.static_imports;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(2.5);

		System.out.println(
			"Circumference: " + circle.getCircumference() +
			"\nArea: " + circle.getArea() +
			"\nLarger radius: " + circle.getLargerRadius(3.0) +
			"\nSmaller radius: " + circle.getSmallerRadius(1.0) +
			"\nRadius squared: " + circle.getRadiusSquared() +
			"\nRadius square root: " + circle.getRadiusSquareRoot()
		);
	}
}
