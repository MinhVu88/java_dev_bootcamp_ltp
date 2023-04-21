package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

public class Main5 {
  public static void main(String[] args) {
    Car5 car_7 = new Car5("Lamborghini", "yellow", 831, 1997);

    // both car_7 & car_8 refer to the same object in memory
    // updates made in 1 object will be reflected in the other
    // this is bad practice & can be avoided by using "copy constructor"
    Car5 car_8 = car_7;

    car_7.setColor("green");
    car_8.setColor("orange");
    car_7.setColor("blue");
    car_8.setColor("purple");
    car_7.setColor("fuchsia");
    car_8.setColor("beige");

    System.out.println(
      "car_7.hashCode() -> " + car_7.hashCode() +
      " | car_8.hashCode() -> " + car_8.hashCode()
    );

    System.out.println(
      "car_7.getColor() -> " + car_7.getColor() +
      " | car_8.getColor() -> " + car_8.getColor()
    );

    // utilise the "copy constructor" tactic
    car_8 = new Car5(car_7);

    System.out.println(
      "car_7.hashCode() -> " + car_7.hashCode() +
      " | car_8.hashCode() -> " + car_8.hashCode()
    );
  }
}
