package com.udemy.ltp.java_dev_bootcamp.sections.sec_16_objects;

public class Main8 {
  public static void main(String[] args) {
    String[] spareParts = new String[] {"tires", "keys"};

    Car8 car_12 = new Car8("Infiniti", "blue", 326, 2004, spareParts);
    Car8 car_13 = new Car8("Maserati", "gray", 678, 1976, spareParts);

    spareParts[0] = "shovel";

    car_12.drive();
    car_13.drive();
  }
}
