package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

public class Main3 {
  public static void main(String[] args) {
    Car3 car_5 = new Car3("Porsche", "silver", 492, 1956);

    System.out.println(
      "Make: " + car_5.getMake() +
      " | Color: " + car_5.getColor() +
      " | Year: " + car_5.getYear() +
      " | Price: $" + car_5.getPrice()
    );
  }
}
