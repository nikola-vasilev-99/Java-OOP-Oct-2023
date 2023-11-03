package Unit2_Encapsulation.EX1SortByNameAndAge;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        int numberPeople = Integer.parseInt(reader.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberPeople; i++) {
            String[] input = reader.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            Person person = new Person(firstName, lastName, age);
            people.add(person);
        }

        Collections.sort(people, Comparator.comparing(Person::getFirstName).thenComparingInt(Person::getAge));

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
