package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_22_map_collections.map_equality;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// Hashcode
		Contact contact1 = new Contact("Alice", 30);
		// Contact contact2 = contact1;
		Contact contact2 = new Contact(contact1);

		System.out.println(
			"1st Hashcode: " + contact1.hashCode() +
			" | 2nd Hashcode: " + contact2.hashCode()
		);

		// Equals
		System.out.println("Equality: " + contact1.equals(contact2));

		// HashCode & Equals
		Map<Contact, String> peopleMap = new HashMap<>();

		peopleMap.put(new Contact("Alice", 30), "1806 Farm Meadow Drive");
		peopleMap.put(new Contact("Bob", 35), "4046 Weekley Street");
		peopleMap.put(new Contact("Charles", 36), "1110 Cerullo Road");
		peopleMap.put(new Contact("Todd", 35), "3300 Ross Street");
		peopleMap.put(new Contact("Leah", 43), "3392 Clarksburg Park Road");
		peopleMap.put(new Contact("Brad", 40), "499 Diane Street");
		peopleMap.put(new Contact("Stephen", 36), "4 Meadowview Drive");
		peopleMap.put(new Contact("Lauren", 37), "514 Summit Park Avenue");
		peopleMap.put(new Contact("Adam", 42), "146 Devils Hill Road");
		peopleMap.put(new Contact("Hilary", 34), "397 Winifred Way");
		peopleMap.put(new Contact("Noah", 41), "1833 Maloy Court");

		System.out.println("Alice's address is: " + peopleMap.get(new Contact("Alice", 30)));
		System.out.println("Adam's address is: " + peopleMap.get(new Contact("Adam", 42)));

		System.out.print(
			"Is Noah, 41 years of age, in my contacts? -> " +
			(peopleMap.containsKey(new Contact("Noah", 41)) ? "Yes!" : "No, sorry")
		);
	}
}
