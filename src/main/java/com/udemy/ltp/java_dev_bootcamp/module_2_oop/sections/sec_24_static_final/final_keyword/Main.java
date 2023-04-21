package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_24_static_final.final_keyword;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee("John", 45);
		Employee emp2 = new Employee("Lisa", 20);

		System.out.println("Retirement Age: " + Employee.MAX_WORKING_AGE);
		System.out.println("Minimum Working Age: " + Employee.MIN_WORKING_AGE);

		System.out.println(
			emp1.getName() + ", you can retire in " +
			(Employee.MAX_WORKING_AGE - emp1.getAge()) + " years."
		);

		System.out.println(
			emp2.getName() + ", you have been eligible to work for " +
			(emp2.getAge() - Employee.MIN_WORKING_AGE) + " years."
		);
	}
}
