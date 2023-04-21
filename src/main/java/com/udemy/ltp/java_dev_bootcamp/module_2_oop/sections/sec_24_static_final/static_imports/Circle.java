package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_24_static_final.static_imports;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		// return 2 * Math.PI * radius;
		return 2 * PI * radius;
	}

	public double getArea() {
		// return Math.PI * radius * radius;
		return PI * radius * radius;
	}

	public double getLargerRadius(double otherRadius) {
		// return Math.max(radius, otherRadius);
		return max(radius, otherRadius);
	}

	public double getSmallerRadius(double otherRadius) {
		// return Math.min(radius, otherRadius);
		return min(radius, otherRadius);
	}

	public double getRadiusSquared() {
		// return Math.pow(radius, 2);
		return pow(radius, 2);
	}

	public double getRadiusSquareRoot() {
		// return Math.sqrt(radius);
		return sqrt(radius);
	}
}