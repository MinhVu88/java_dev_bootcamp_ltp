package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

public class Main2 {
  public static void main(String[] args) {
    Car2 car_3 = new Car2("Ford Mustang", "red", 365, 1969);

    System.out.println(
      "Make: " + car_3.make +
      " | Color: " + car_3.color +
      " | Year: " + car_3.year +
      " | Price: $" + car_3.price
    );

    Car2 car_4 = new Car2("Audi", "gray", 284, 1997);

    System.out.println(
      "Make: " + car_4.make +
      " | Color: " + car_4.color +
      " | Year: " + car_4.year +
      " | Price: $" + car_4.price
    );
  }
}
