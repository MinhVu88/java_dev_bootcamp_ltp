package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.workbooks.sec_16.workbook_7_1;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
  
    person.name = "Maynard James Keenan";
    person.nationality = "American";
    person.dateOfBirth = "April 17th 1964";
    person.passport = new String[] {person.name, person.nationality, person.dateOfBirth};
    person.seatNumber = 462;

    System.out.println(
      "Name: " + person.name +
      " | Nationality: " + person.nationality +
      " | Birth date: " + person.dateOfBirth +
      " | Seat number: " + person.seatNumber +
      " | Passport info: " + Arrays.toString(person.passport)
    );
  }
}
