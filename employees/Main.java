package employees;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Employee employ1 = new Employee("Alex", 2.5, 7000);
        System.out.println("Name employ1: " + employ1.getName());

        Employee employ2 = new Employee("Betty", 5, 5000);
        System.out.println("Name employ2: " + employ2.getName());

        Employee employ3 = new Employee("Alex",  3, 10000);

        System.out.println("Name employ3: " + employ3.getName());

        employ1.setName("user admin");
        employ1.printDetails();


        employ2.printDetails();

        employ2.update("tester", 5255, 985);
        employ2.printDetails();


        Employee employ4 = new Employee("mar", 2, 2500);

        String newname = employ4.getName();
        double newExperience = employ4.getExperience();
        double newSalary = employ4.getSalary();

        System.out.format(" Name: %s, Experience: %.2f, Salary: %.2f", newname, newExperience,newSalary);


        System.out.println("\n ***** before incremented salary ******");


        Employee employSalary = new Employee("alexy", 3, 2500);
        System.out.println("Bonus employSalary: " + employSalary.calculateBonus(10));
        System.out.println("increment salary: " + employSalary.claculauteIncrement());
        System.out.println(" updated Salary: " + employSalary.getSalary());






    }
}
