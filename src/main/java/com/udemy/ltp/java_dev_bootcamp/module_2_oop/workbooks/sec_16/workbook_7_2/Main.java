package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.workbooks.sec_16.workbook_7_2;

public class Main {
  public static void main(String[] args) {
    Person person = new Person(
      "Maynard James Keenan", 
      "American", 
      "April 17th 1964", 
      462
    );
  
    System.out.println(
      "Name: " + person.name +
      " | Nationality: " + person.nationality +
      " | Birth date: " + person.dateOfBirth +
      " | Seat number: " + person.seatNumber
    );
  }
}
