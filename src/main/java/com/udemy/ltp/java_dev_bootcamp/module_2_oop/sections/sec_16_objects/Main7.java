package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

public class Main7 {
  public static void main(String[] args) {
    String[] spareParts = new String[] {"tires", "keys"};

    Car7 car_10 = new Car7("Infiniti", "blue", 326, 2004, spareParts);
    Car7 car_11 = new Car7("Maserati", "gray", 678, 1976, spareParts);

    spareParts[0] = "shovel";

    car_10.drive();
    car_11.drive();
  }
}
