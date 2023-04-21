package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_27_higher_order_functions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main6 {
	public static void main(String[] args) {
		// Creating Stream from Datasource: Array
		String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};
		Arrays.stream(greetings).forEach(System.out::println);

		System.out.println("-------------------------------------------------------");

		// Creating Stream from Datasource: File
		String filePath = "src/main/java/com/udemy/ltp/java_dev_bootcamp/module_2_oop/sections/sec_27_higher_order_functions/chorus.txt";

		try {
			Path path = Paths.get(filePath);
			Files.lines(path).forEach(System.out::println);
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
}