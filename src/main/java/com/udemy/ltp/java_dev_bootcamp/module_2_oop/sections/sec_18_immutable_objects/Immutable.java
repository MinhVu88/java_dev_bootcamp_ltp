package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_18_immutable_objects;

public class Immutable {
	public static void main(String[] args) {
		int intValue = 5;
		Integer intValueWrapper = null;
		intValueWrapper = 5;
		System.out.println("int: " + intValue + " | Integer: " + intValueWrapper.toString());

		long longValue = 1_000_000_000_000L;
		Long longValueWrapper = 1_000_000_000_000L;
		System.out.println("long: " + longValue + " | Long: " + longValueWrapper.toString());

		double doubleValue = 1.25;
		Double doubleValueWrapper = 1.25;
		System.out.println("double: " + doubleValue + " | Double: " + doubleValueWrapper);

		boolean boolValue = true;
		Boolean boolValueWrapper = true;
		System.out.println("boolean: " + boolValue + " | Boolean: " + boolValueWrapper);

		char charValue = 'a';
		Character charValueWrapper = 'a';
		System.out.println("char: " + charValue + " | Character: " + charValueWrapper);
	}
}
