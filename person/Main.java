package person;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Doe", "John", 25);
        Person p2 = new Person("Smith", "Jane", 20);
        Person p3 = new Person("Wonderland", "Alice", 30);

        Person[] person = { p1, p2, p3 };

        int totalAge = 0;
        int ageMax = Integer.MIN_VALUE;

        for (Person per : person) {
            totalAge += per.getAge();

            if (ageMax < per.getAge()) {
                ageMax = per.getAge();
            }

        }

        int givenAge = 40;
        int coutAgeabove = countPersonsAboveAge(person, givenAge);


        double averageAge = totalAge / person.length;
        System.out.println("\nTotal age of all persons is : " + totalAge + ". Average age is : " + averageAge + "\n");

        System.out.println(ageMax);

        System.out.println("Number of persons aged  " + givenAge + " are " + coutAgeabove);

    }



    public static int countPersonsAboveAge(Person[] persons, int age) {
        int count = 0;
        for (Person person : persons) {
            if (person.getAge() >= age) {
                count++;
            }
        }
        return count;
    }
    

}
