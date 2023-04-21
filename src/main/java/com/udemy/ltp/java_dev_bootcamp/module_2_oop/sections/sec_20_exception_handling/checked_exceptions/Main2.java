package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_20_exception_handling.checked_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		String file = "src/main/java/com/udemy/ltp/java_dev_bootcamp/module_2_oop/sections/sec_20_exception_handling/checked_exceptions/greetings.txt";
		Main2.readFile(file);
	}

	public static void readFile(String fileName) {
		try(
			FileInputStream fileInputStream = new FileInputStream(fileName);
			Scanner scanner = new Scanner(fileInputStream)
		) {
			System.out.println(scanner.nextLine());
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(IOException e) {
			throw new RuntimeException(e);
		} finally {
			System.out.println("process complete");
		}
	}
}