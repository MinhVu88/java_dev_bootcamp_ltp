package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_19_list_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		List<String> cities1 = new ArrayList<>();

		System.out.println(
			"cities1: " + cities1 +
			" | cities1.size() -> " + cities1.size()
		);

		cities1.add("Munich");
		cities1.add("Münster");
		cities1.add("Dortmund");
		cities1.add("Essen");
		cities1.add("Düsseldorf");
		cities1.add("Cologne");
		cities1.add("Bochum");
		cities1.add("Gelsenkirchen");
		cities1.add("Lünen");
		cities1.add("Hagen");
		cities1.add("Duisburg");
		cities1.add("Erfurt");
		cities1.add("Wuppertal");
		cities1.add("Darmstadt");
		cities1.add("Regensburg");
		cities1.add("Bergkamen");
		cities1.add("Hamm");
		cities1.add("Witten");
		cities1.add("Castrop-Rauxel");
		cities1.add("Schwerte");

		System.out.println(
			"cities1: " + cities1 +
			" | cities1.size() -> " + cities1.size() +
			" | cities1.get(7) -> " + cities1.get(7)
		);

		cities1.set(3, "Freiburg im Breisgau");

		System.out.println(
			"cities1: " + cities1 +
			" | cities1.size() -> " + cities1.size()
		);

		cities1.remove(4);

		System.out.println(
			"cities1: " + cities1 +
			" | cities1.size() -> " + cities1.size()
		);

		System.out.println("------------------------------------------------------------------------------");

		List<String> cities2 = new LinkedList<>();

		cities2.add("Braunau am Inn");
		cities2.add("Linz");
		cities2.add("Salzburg");
		cities2.add("Klagenfurt am Wörthersee");
		cities2.add("Innsbruck");
		cities2.add("Vienna");
		cities2.add("Graz");
		cities2.add("Bregenz");
		cities2.add("Eisenstadt");
		cities2.add("Krems an der Donau");
		cities2.add("Sankt Pölten");
		cities2.add("Feldkirch");
		cities2.add("Sankt Gilgen");
		cities2.add("Hallstatt");
		cities2.add("Steyr");
		cities2.add("Lienz");
		cities2.add("Freistadt");
		cities2.add("Wiener Neustadt");
		cities2.add("Dürnstein");
		cities2.add("Leonding");

		System.out.println(
			"cities2: " + cities2 +
			" | cities2.size() -> " + cities2.size() +
			" | cities2.get(7) -> " + cities2.get(7)
		);

		cities2.set(3, "Wolfsberg");

		System.out.println(
			"cities2: " + cities2 +
			" | cities2.size() -> " + cities2.size()
		);

		cities2.remove(4);

		System.out.println(
			"cities2: " + cities2 +
			" | cities2.size() -> " + cities2.size()
		);
	}
}
