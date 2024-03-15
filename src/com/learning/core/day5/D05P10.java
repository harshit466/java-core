package com.learning.core.day5;
import java.util.TreeSet;

public class D05P10 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(1, "Alice", 30, 1000.0));
        persons.add(new Person(2, "Bob", 35, 2000.0));
        persons.add(new Person(3, "Charlie", 40, 3000.0));
        persons.add(new Person(4, "Jones", 22, 6999.0));
        persons.add(new Person(5, "John", 32, 4000.0));
        persons.add(new Person(6, "Tom", 42, 5000.0));

        for (Person person : persons) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}