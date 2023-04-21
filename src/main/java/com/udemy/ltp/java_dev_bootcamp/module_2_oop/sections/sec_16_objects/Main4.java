package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_16_objects;

public class Main4 {
  public static void main(String[] args) {
    Car4 car_6 = new Car4("BMW", "gray", 231, 1972);

    System.out.println(
      "Make: " + car_6.getMake() +
      " | Color: " + car_6.getColor() +
      " | Year: " + car_6.getYear() +
      " | Price: $" + car_6.getPrice()
    );

    car_6.setMake("Ferrari");
    car_6.setColor("white");
    car_6.setPrice(car_6.getPrice() + 100);
    car_6.setYear(car_6.getYear() + 8);

    System.out.println(
      "Make: " + car_6.getMake() +
      " | Color: " + car_6.getColor() +
      " | Year: " + car_6.getYear() +
      " | Price: $" + car_6.getPrice()
    );
  }
}
