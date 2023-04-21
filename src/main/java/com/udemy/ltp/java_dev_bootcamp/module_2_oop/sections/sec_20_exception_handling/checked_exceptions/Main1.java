// checked exceptions are also known as compile-time exceptions
package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_20_exception_handling.checked_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main1 {
	public static void main(String[] args) {
		String file = "src/main/java/com/udemy/ltp/java_dev_bootcamp/module_2_oop/sections/sec_20_exception_handling/checked_exceptions/greetings.txt";

		try(FileInputStream fileInputStream = new FileInputStream(file)) {
			int contents;

			while((contents = fileInputStream.read()) != -1) {
				System.out.print((char) contents + " ");
			}
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
}